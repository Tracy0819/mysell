package com.mysell.mysell.Service.Impl;

import com.mysell.mysell.Dao.mapper.ProductDaoMapper;
import com.mysell.mysell.Entity.ProductInfo;
import com.mysell.mysell.Service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductDaoMapper productDao;

    @Override
    public ProductInfo findProductById(String id) {
       ProductInfo productInfo =  productDao.findProductById(id);
       log.info("进入了service层的findProductById方法.............");
       return productInfo;
    }

    @Override
    public ArrayList<ProductInfo> findAll() {

        ArrayList<ProductInfo> productInfos = productDao.findAll();

        return productInfos;
    }
}
