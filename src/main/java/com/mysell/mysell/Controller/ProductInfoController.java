package com.mysell.mysell.Controller;


import com.mysell.mysell.Entity.ProductInfo;
import com.mysell.mysell.Service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/buyer/product")
public class ProductInfoController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/list")
    public ArrayList<ProductInfo> list(){
        return productInfoService.findAll();
    }
}
