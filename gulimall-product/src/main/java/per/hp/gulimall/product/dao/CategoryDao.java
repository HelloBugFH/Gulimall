package per.hp.gulimall.product.dao;

import per.hp.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 15:27:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
