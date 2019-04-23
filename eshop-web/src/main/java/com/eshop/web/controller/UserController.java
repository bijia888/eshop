package com.eshop.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eshop.api.SearchService;
import com.eshop.api.UserService;
import com.eshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Reference
    private SearchService searchService;

    @RequestMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        return userService.findByUserId(id);
    }

    @RequestMapping("/list")
    public List<User> findUserById(){
        return userService.findAll();
    }

    @RequestMapping("searchTest")
    public String searchTest(){
        return searchService.searchTest();
    }
}
