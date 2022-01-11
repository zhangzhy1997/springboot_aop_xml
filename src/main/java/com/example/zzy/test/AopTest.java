package com.example.zzy.test;

import com.example.zzy.entity.User;
import com.example.zzy.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void aopTest() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) ctx.getBean("service");

        User user = new User();
        user.setId(1);
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@xxx.com");

        service.addNewUser(user);
        service.saveNewUser(user);
    }

}