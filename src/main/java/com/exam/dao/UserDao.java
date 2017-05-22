package com.exam.dao;

import com.exam.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Tman on 2017/3/31.
 */
public interface UserDao {


    /**
     * user增加操作
     * @param user
     * @return
     */
    int userAdd(@Param("user") User user);

    /**
     * 根据userId查询出对象
     * @return
     */
    User queryById(@Param("userId") long userId);

    /**
     * 根据偏移量查询人员
     * @return
     */
    List<User> queryAll(@Param("offset") int offset ,@Param("limit") int limit);


    List<User> queryByUserName(@Param("userName") String userName);
}
