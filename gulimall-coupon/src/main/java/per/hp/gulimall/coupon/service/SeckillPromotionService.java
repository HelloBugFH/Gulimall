package per.hp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.hp.common.utils.PageUtils;
import per.hp.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 17:20:43
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

