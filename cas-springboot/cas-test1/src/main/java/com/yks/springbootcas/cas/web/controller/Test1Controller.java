package com.yks.springbootcas.cas.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {

    @RequestMapping("test1")
    public String test1(){

        return "这是test1111......服务";

    }

}
