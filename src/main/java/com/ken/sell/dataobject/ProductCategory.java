package com.ken.sell.dataobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 */
@Entity
public class ProductCategory {
    /*类目id*/
    @Id
    @GeneratedValue
    private Integer categpryId;
    /*类目名字*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;

    public Integer getCategpryId() {
        return categpryId;
    }

    public void setCategpryId(Integer categpryId) {
        this.categpryId = categpryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }
}
