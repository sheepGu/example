package com.exam.service;

import com.exam.dto.ExamResult;
import com.exam.dto.UserExecution;
import com.exam.entity.User;

import java.util.List;

/**
 * Created by Tman on 2017/3/31.
 */
public interface UserService {

    List<User> getUserList(int offset,int limit);

    User getById(long userId);

    int userADD(User user);
    User validate(String userName, String passWord);
}
