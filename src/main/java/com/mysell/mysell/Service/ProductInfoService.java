package com.mysell.mysell.Service;

import com.mysell.mysell.Entity.ProductInfo;

import java.util.ArrayList;

public interface ProductInfoService {

    ProductInfo findProductById(String id);

    ArrayList<ProductInfo> findAll();
}
