package com.ken.service.impl;

import com.ken.dataobject.ProductInfo;
import com.ken.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PorductServiceImplTest {

    @Autowired
    private  PorductServiceImpl porductService;

    @Test
    public void findOne() {
        ProductInfo productInfo= porductService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList =porductService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest=new PageRequest(0,2);
        Page<ProductInfo> productInfoPage= porductService.findAll(pageRequest);
        System.out.println( productInfoPage.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo= new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("小米");
        productInfo.setProductPrice(new BigDecimal(2.4));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("脆");
        productInfo.setProductIcon("http");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(1);
        ProductInfo result= porductService.save(productInfo);
        Assert.assertNotNull(result);
    }
}