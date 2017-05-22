package com.exam.service.impl;

import com.exam.Exception.UserException;
import com.exam.dao.UserDao;
import com.exam.dto.ExamResult;
import com.exam.dto.UserExecution;
import com.exam.entity.User;
import com.exam.enums.UserStatEnum;
import com.exam.service.UserService;
import com.exam.util.Md5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Tman on 2017/3/31.
 */
@Service
public class UserServiceImpl implements UserService{
    private Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);
    private static String md5String="dasdasdasdasd";

    @Resource
    private UserDao userDao;



    public List<User> getUserList(int offset,int limit) {
        List<User> userList=userDao.queryAll(offset,limit);
        return userList;
    }

    public User getById(long userId) {
        User user=userDao.queryById(userId);
        return user;
    }

    public int userADD(User user) {
        int i=userDao.userAdd(user);
        return i;
    }

    public User validate(String userName, String passWord) {
        try {
            List<User> users=userDao.queryByUserName(userName);
            if (users==null||users.size()<=0) {
                throw new UserException(UserStatEnum.NOSUCHUSER.getStateInfo());
            }
            if(users.size()>1){
                throw new UserException(UserStatEnum.REPEATUSER.getStateInfo());
            }
            passWord= Md5Util.getMD5(passWord);
            User user=users.get(0);
            //如果用户密码匹配，返回对象。
            if(user.getPassWord().equals(passWord)){
                return user;
            }else{
                throw new UserException(UserStatEnum.ERROR.getStateInfo());
            }
        }catch (UserException userExecution){
            throw userExecution;
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            throw new UserException(UserStatEnum.INNER_ERROR.getStateInfo());
        }

    }
}
