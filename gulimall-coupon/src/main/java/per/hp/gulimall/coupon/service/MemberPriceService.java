package per.hp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.hp.common.utils.PageUtils;
import per.hp.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 17:20:43
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

