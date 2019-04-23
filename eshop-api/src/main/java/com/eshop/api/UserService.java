package com.eshop.api;

import com.eshop.entity.User;

import java.util.List;

public interface UserService {

    public User findByUserId(Long id);

    List<User> findAll();
}
