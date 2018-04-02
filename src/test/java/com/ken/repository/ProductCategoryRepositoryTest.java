package com.ken.repository;

import com.ken.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private  ProductCategoryRepository repository;

    @Test
    public  void  findOneTest(){
        ProductCategory productCategory=repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    //@Transactional
    public  void  saveTest(){
        ProductCategory productCategory=new ProductCategory("美女",1);
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
    }
    @Test
    public  void  saveTest1(){
        ProductCategory productCategory=repository.findOne(1);
        productCategory.setCategoryName("热饮2");
        repository.save(productCategory);
        System.out.println(productCategory.toString());
    }
    @Test
    public  void  findByCategoryTypeInTest(){
        List<Integer> list= Arrays.asList(1,2);
        List<ProductCategory> list1=repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,list1.size());
    }


}