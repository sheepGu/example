package com.exam.entity;

import java.util.Date;

/**
 * Created by Tman on 2017/3/31.
 * 用户基本类
 */
public class User {

    private Long userId;
    private String userName;
    private Long createUserId;
    private Date createTime;
    private String status;
    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User() {
    }

    public User(Long userId, String userName, Long createUserId, Date createTime, String status) {
        this.userId = userId;
        this.userName = userName;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.status = status;
    }

    public User(Long userId, String userName, Long createUserId, Date createTime, String status, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.createUserId = createUserId;
        this.createTime = createTime;
        this.status = status;
        this.passWord = passWord;
    }
}
