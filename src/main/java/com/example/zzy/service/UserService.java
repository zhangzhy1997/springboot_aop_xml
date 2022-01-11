package com.example.zzy.service;

import com.example.zzy.entity.User;

/**
 * 用户业务接口，定义了所需的业务方法
 */
public interface UserService {
    public void addNewUser(User user);

    public void saveNewUser(User user);
}