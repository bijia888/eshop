package com.eshop.web.controller;

import com.eshop.api.UserService;
import com.eshop.dao.UserRepository;
import com.eshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private UserService userService;
    @Autowired
    private UserRepository userDao;

    @RequestMapping("/{id}")
    public User findUserById(@PathVariable Long id){
        return userDao.findUserById(id);
    }
}
