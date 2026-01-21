package goorm.athena.domain.userCoupon.event.message;

public record UserCouponIssueMessage(
        Long userId,
        Long couponId,
        int luaResult
) {}