package per.hp.gulimall.coupon.dao;

import per.hp.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 17:20:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
