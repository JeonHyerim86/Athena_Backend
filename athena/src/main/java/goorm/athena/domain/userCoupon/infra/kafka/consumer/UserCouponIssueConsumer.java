package goorm.athena.domain.userCoupon.infra.kafka.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import goorm.athena.domain.userCoupon.event.UserCouponIssueGateway;
import goorm.athena.domain.userCoupon.event.message.UserCouponIssueMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserCouponIssueConsumer {

    private final UserCouponIssueGateway gateway;
    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "user-coupon-issue", groupId = "user-coupon-group")
    public void listen(String messageJson) {
        try {
            UserCouponIssueMessage message = objectMapper.readValue(messageJson, UserCouponIssueMessage.class);
            log.info("[Kafka Consumer] Received message: {}", message);
            gateway.issueUserCoupon(message.userId(), message.couponId(), message.luaResult());
        } catch (Exception e) {
            log.error("Kafka 메시지 처리 실패", e);
        }
    }
}