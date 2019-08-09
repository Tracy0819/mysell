package com.mysell.mysell.Dao.mapper;

import com.mysell.mysell.Entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductDaoMapperTest {
    @Autowired
    private  ProductDaoMapper mapper;

    @Test
    public void findProductByIdMapper() {
        ProductInfo productInfo = mapper.findProductById("1");
        System.out.println(productInfo.getProductName());
    }

    @Test
    public void save(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setProductName("小龙虾");
        productInfo.setProductPrice(BigDecimal.valueOf(3.28));
        productInfo.setProductStock(500);
        productInfo.setProductCategoryType(2);
        productInfo.setProductDescription("我不知道小龙虾为什么好吃");
        productInfo.setProductIcon("http://xxxxxxx.png");
        productInfo.setProductOnOffStatus(1);
       int result =  mapper.save(productInfo);
        System.out.println("result: " + result);
    }

    @Test
    public void deleteById(){
       int result =  mapper.deleteById("2");
        Assert.assertEquals(1,result);
    }

    @Test
    public void updateStockById() {
        mapper.updateStockById("1",800);

    }

    @Test
    public void findAll(){
       ArrayList<ProductInfo> productInfos =  mapper.findAll();
        System.out.println(productInfos.size());
    }

}