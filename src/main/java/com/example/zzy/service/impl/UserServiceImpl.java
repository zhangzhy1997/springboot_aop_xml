package com.example.zzy.service.impl;

import com.example.zzy.dao.UserDao;
import com.example.zzy.entity.User;
import com.example.zzy.service.UserService;

/**
 * 用户业务类，实现对User功能的业务管理
 */
public class UserServiceImpl implements UserService {

    // 声明接口类型的引用，和具体实现类解耦合
    private UserDao dao;

    // dao 属性的setter访问器，会被Spring调用，实现设值注入
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void addNewUser(User user) {
        // 调用用户DAO的方法保存用户信息
        dao.save(user);
    }

    public void saveNewUser(User user) {
        // 调用用户DAO的方法保存用户信息
        dao.save(user);
    }
}