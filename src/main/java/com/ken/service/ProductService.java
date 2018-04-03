package com.ken.service;

import com.ken.dataobject.ProductInfo;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    /**
     * 查询商品列表
     * @param productId
     * @return
     */
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable);


    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
