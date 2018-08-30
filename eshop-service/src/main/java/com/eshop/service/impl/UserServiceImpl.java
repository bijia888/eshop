package com.eshop.service.impl;

import com.eshop.api.UserService;
import com.eshop.dao.UserDao;
import com.eshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUserId() {
        return new User();
    }
}
