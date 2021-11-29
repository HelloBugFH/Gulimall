package per.hp.gulimall.product;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import per.hp.gulimall.product.entity.BrandEntity;
import per.hp.gulimall.product.service.BrandService;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setLogo("cjasd");
        brandEntity.setBrandId(1L);
        brandService.updateById(brandEntity);
    }

}
