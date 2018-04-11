package com.ken.controller;


import com.ken.service.CategoryService;

import com.ken.service.ProductService;
import com.ken.vo.ProductInfoVo;
import com.ken.vo.ProductVo;
import com.ken.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * 买家商品
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVo list(){
        //1.查询所有的上架商品

        //2.查询类目（一次查询）

        //3.数据拼装
        ResultVo resultVo= new ResultVo();
        ProductVo productVo= new ProductVo();
        ProductInfoVo productInfoVo=new ProductInfoVo();
        //TODO 不安全访问
        productVo.setProductInfoVoList(Arrays.asList(productInfoVo));

        resultVo.setCode(1);
        resultVo.setMsg("成功");
        resultVo.setData(productVo);
        return  resultVo;
    }
}
