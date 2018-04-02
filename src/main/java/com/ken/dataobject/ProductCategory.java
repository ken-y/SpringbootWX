package com.ken.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 *
 */
@Entity
//@Table(name = "product_category")
@DynamicUpdate
@Data
public class ProductCategory {
    /*类目id*/
    @Id
    @GeneratedValue
    //@Column(name = "categpory_id")
    private Integer categoryId;
    /*类目名字*/
    //@Column(name = "category_name")
    private String categoryName;
    /*类目编号*/
    //@Column(name = "category_type")
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
