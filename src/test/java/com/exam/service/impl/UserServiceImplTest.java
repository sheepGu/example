package com.exam.service.impl;

import com.exam.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.swing.*;

import static org.junit.Assert.*;

/**
 * Created by Tman on 2017/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class UserServiceImplTest {

    @Resource

    private UserServiceImpl userServiceImpl;

    @Test
    public void validate() throws Exception {
            userService.validate("admin","1234565");
    }

    @Resource
    private UserService userService;

    @Test
    public void getUserList() throws Exception {
        userService.getUserList(2,1);
    }

    @Test
    public void getById() throws Exception {

    }

    @Test
    public void userADD() throws Exception {

    }

}