package com.exam.controller;

import com.exam.Exception.UserException;
import com.exam.dto.ExamResult;
import com.exam.dto.UserExecution;
import com.exam.entity.User;
import com.exam.enums.UserStatEnum;
import com.exam.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Tman on 2017/4/2.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/tologin")
    public String getLogin(){

        return "login/login";
    }


    @RequestMapping(value = "/loginValidate",method = RequestMethod.POST,produces ={"application/json;charset=UTF-8"} )
    @ResponseBody()
    public ExamResult<UserExecution> validate(HttpServletRequest req, HttpServletResponse res){

        String userName=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        logger.info("userName={}",userName);
        logger.info("passWord={}",passWord);
        ExamResult<UserExecution> result;
        if (userName==null|| StringUtils.isEmpty(userName)){
                result=new ExamResult<UserExecution>(false,"用户名不能为空");
        }
        if(passWord==null||StringUtils.isEmpty(passWord)){
                result=new ExamResult<UserExecution>(false,"密码不能为空");
        }
        try{
            User user=userService.validate(userName,passWord);
            UserExecution userExecution=new UserExecution();
            userExecution.setUserId(user.getUserId());
            userExecution.setUserName(user.getUserName());
            result= new ExamResult<UserExecution>(true,userExecution, UserStatEnum.SUCCESS.getStateInfo());
            req.getSession().setAttribute("user",user);
        }catch (UserException e){
                result= new ExamResult<UserExecution>(false,e.getMessage());
        }catch (Exception u){
            result= new ExamResult<UserExecution>(false,UserStatEnum.INNER_ERROR.getStateInfo());
        }
        return result;
    }


}
