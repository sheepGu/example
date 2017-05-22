package com.exam.dao;

import com.exam.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Tman on 2017/3/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;


    /**
     * 测试Add
     * @throws Exception
     */
    @Test
    public void userAdd() throws Exception {
        User user=new User();
        user.setUserName("admin");
        user.setPassWord("123456");
        user.setCreateUserId(1L);
        user.setStatus("0");
        userDao.userAdd(user);
    }

    /**
     * 测试QueryById
     * @throws Exception
     */
    @Test
    public void queryById() throws Exception {
            userDao.queryById(1L);
    }

    /**
     * 测试获取List
     * @throws Exception
     */
    @Test
    public void queryAll() throws Exception {
        userDao.queryAll(2,1);
    }
}