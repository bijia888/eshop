package com.eshop.dao;

import com.eshop.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User,Long>{

    public User findUserById(Long id);

}
