package com.example.zzy.dao.impl;

import com.example.zzy.dao.UserDao;
import com.example.zzy.entity.User;

/**
 * 用户DAO类，实现IDao接口，负责User类的持久化操作
 */
public class UserDaoImpl implements UserDao {

    public void save(User user) {
        // 这里并未实现完整的数据库操作，仅为说明问题
        System.out.println("保存用户信息到数据库");
    }
}