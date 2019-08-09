package com.mysell.mysell.Dao;


import com.mysell.mysell.Entity.ProductInfo;


public interface ProductDao {

    ProductInfo findProductById(Integer id);

}
