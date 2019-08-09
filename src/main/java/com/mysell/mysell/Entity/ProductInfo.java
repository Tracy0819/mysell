package com.mysell.mysell.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
@Data
public class ProductInfo {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    /**
     * 产品类目类型
     */
    private Integer productCategoryType;

    private String productDescription;

    private String productIcon;

    /**
     * 产品上下架状态 默认设置为1 为上架
     */
    private int productOnOffStatus =1;

    private Date createTime;

    private Date updateTime;



}
