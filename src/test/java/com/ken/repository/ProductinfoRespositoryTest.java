package com.ken.repository;

import com.ken.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductinfoRespositoryTest {

    @Autowired
    private  ProductinfoRespository repository;

    @Test
    public  void saveTest(){
       ProductInfo productInfo= new ProductInfo();
       productInfo.setProductId("123456");
       productInfo.setProductName("苹果");
       productInfo.setProductPrice(new BigDecimal(2.4));
       productInfo.setProductStock(100);
       productInfo.setProductDescription("脆");
       productInfo.setProductIcon("http");
       productInfo.setProductStatus(0);
       productInfo.setCategoryType(2);
        repository.save(productInfo);
    }


    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList= repository.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList);
    }
}