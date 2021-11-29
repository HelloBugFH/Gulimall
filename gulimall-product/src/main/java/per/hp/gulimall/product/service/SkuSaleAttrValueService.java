package per.hp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import per.hp.common.utils.PageUtils;
import per.hp.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 16:08:06
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

