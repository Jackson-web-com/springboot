package com.imooc.springbootproj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Value("${mall.config.name}")
    private String name;
    @Value("${mall.config.description}")
    private String description;
    @Value("${mall.config.hot-sales}")
    private Integer hotSales;
    @Value("${mall.config.show-advert}")
    private Boolean showAdvert;


    @RequestMapping("/out")
    @ResponseBody
    public String out(){
        System.out.println("");
        return "success";
    }

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return String.format("name:%s,description:%s,hot-sales:%s,show-advert:%s",
                name, description, hotSales, showAdvert);


    }
}
