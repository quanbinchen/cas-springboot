package com.yks.springbootcas.cas.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test3")
    public String test1(){

        return "这是test3333......服务";

    }


}
