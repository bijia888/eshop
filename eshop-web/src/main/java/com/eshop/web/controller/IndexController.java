package com.eshop.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class IndexController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(){
        return "this is index page";
    }
}
