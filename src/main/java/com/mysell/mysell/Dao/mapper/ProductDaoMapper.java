package com.mysell.mysell.Dao.mapper;


import com.mysell.mysell.Entity.ProductInfo;

import java.util.ArrayList;

public interface ProductDaoMapper {

    ProductInfo findProductById(String id);

    int save(ProductInfo productInfo);

    int deleteById(String id);

    int updateStockById(String id,int stock);

    ArrayList<ProductInfo> findAll();

}


