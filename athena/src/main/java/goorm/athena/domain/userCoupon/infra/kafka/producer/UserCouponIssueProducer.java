package goorm.athena.domain.userCoupon.infra.kafka.producer;

import goorm.athena.domain.userCoupon.event.message.UserCouponIssueMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserCouponIssueProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "user-coupon-issue";

    public void send(UserCouponIssueMessage message) {
        try {
            String payload = toJson(message); // JSON 변환
            kafkaTemplate.send(TOPIC, payload);
        } catch (Exception e) {
            throw new RuntimeException("Kafka 메시지 전송 실패", e);
        }
    }

    private String toJson(UserCouponIssueMessage message) {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(message);
        } catch (Exception e) {
            throw new RuntimeException("직렬화 실패", e);
        }
    }
}