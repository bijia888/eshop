package com.eshop.service.impl;

import com.eshop.api.UserService;
import com.eshop.dao.UserRepository;
import com.eshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userDao;

    @Override
    public User findByUserId(Long id) {
        User user = userDao.findUserById(id);
        if(user==null){
            return null;
        }
        return user;
    }
}
