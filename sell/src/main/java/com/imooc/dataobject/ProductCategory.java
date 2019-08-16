package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DynamicUpdate
@Data //自动生成get set
public class ProductCategory {

    /**
     * 和数据库表的字段保持一致，下划线改成驼峰
     */

    /** 类目id. */
    @Id
//    @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}


