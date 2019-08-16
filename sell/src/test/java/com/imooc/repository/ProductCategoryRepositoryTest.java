package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();

        productCategory.setCategoryName("房贷放松的");
        productCategory.setCategoryType(65);
        productCategory.setCategoryId(65);
        ProductCategory result = repository.save(productCategory);
        Assert.notNull(result);
        System.out.println(productCategory.toString());
    }

    @Test
    public void updateTest() {
        //findByIdd代指categoryId
        ProductCategory productCategory = repository.findById(2).get();
        productCategory.setCategoryType(7);
        repository.save(productCategory);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> categoryTypeIn = repository.findByCategoryTypeIn(Arrays.asList(1, 2, 3));
        Assert.notEmpty(categoryTypeIn);
    }

//	@Test
//	public void deleteTest() {
//
//		repository.deleteById();
//	}


}