package com.ken.service.impl;

import com.ken.dataobject.ProductInfo;
import com.ken.enums.ProductStatusEnum;
import com.ken.repository.ProductinfoRespository;
import com.ken.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PorductServiceImpl implements ProductService{

    @Autowired
    private ProductinfoRespository respository;

    @Override
    public ProductInfo findOne(String productId) {
        return respository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return respository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
    @Override
    public Page<ProductInfo> findAll(org.springframework.data.domain.Pageable pageable) {
        return respository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return respository.save(productInfo);
    }
}
