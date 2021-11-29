package per.hp.gulimall.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import per.hp.common.utils.R;

@FeignClient("gulimall-coupon")
@Component
public interface CouponFeign {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();
}
