package per.hp.gulimall.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import per.hp.common.utils.PageUtils;
import per.hp.common.utils.R;
import per.hp.gulimall.product.entity.CategoryEntity;
import per.hp.gulimall.product.service.CategoryService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;



/**
 * 商品三级分类
 *
 * @author hpeng
 * @email 207667803@qq.com
 * @date 2021-11-25 16:12:29
 */
@RestController
@RequestMapping("product/category")
@Slf4j
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有的分类和子分类，并且以树形结构组装起来
     * @return 组装好的page数据
     */
    @RequestMapping("/list/tree")
    public R list(){
        List<CategoryEntity> page = categoryService.getCategoryTree();
        return R.ok().put("page",page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:category:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
        log.info("添加菜单"+category.getName());
		categoryService.save(category);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
        log.info("更新菜单"+category.getName());
		categoryService.updateById(category);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){
//		categoryService.removeByIds(Arrays.asList(catIds));

		categoryService.removeMenusByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
