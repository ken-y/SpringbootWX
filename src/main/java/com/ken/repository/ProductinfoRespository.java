package com.ken.repository;

import com.ken.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductinfoRespository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
