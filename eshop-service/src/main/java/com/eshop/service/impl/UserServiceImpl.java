package com.eshop.service.impl;

import com.eshop.api.UserService;
import com.eshop.dao.UserRepository;
import com.eshop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<User>();
        userDao.findAll().forEach(single -> list.add(single) );
        return list;
    }
}
