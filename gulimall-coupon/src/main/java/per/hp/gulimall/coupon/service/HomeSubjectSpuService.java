package per.hp.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.hp.common.utils.PageUtils;
import per.hp.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 17:20:43
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

