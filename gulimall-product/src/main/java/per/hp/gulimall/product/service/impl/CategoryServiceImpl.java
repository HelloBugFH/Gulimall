package per.hp.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import per.hp.common.utils.PageUtils;
import per.hp.common.utils.Query;
import per.hp.gulimall.product.dao.CategoryDao;
import per.hp.gulimall.product.entity.CategoryEntity;
import per.hp.gulimall.product.service.CategoryService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getCategoryTree() {
        // 查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        // 查出所有一级分类
        List<CategoryEntity> level1_menus = categoryEntities.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildren(menu, categoryEntities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());
        return level1_menus;
    }

    @Override
    public void removeMenusByIds(List<Long> asList) {
        // TODO 检查要删除的菜单是否被引用
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream()
                .filter(categoryEntity -> {
                    // 此处如果parentId==null 就get不到值 后续的map操作就无法进行 直接返回
                    return categoryEntity.getParentCid() == root.getCatId();
                })
                .map(menu->{
                    menu.setChildren(getChildren(menu,all));
                    return menu;
                })
                .sorted((menu1,menu2)->{
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());
        return children;
    }

}
