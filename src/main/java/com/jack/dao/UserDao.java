package com.jack.dao;

import com.jack.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll();
}
