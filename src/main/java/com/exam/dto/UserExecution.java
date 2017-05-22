package com.exam.dto;

/**
 * Created by Tman on 2017/4/2.
 */
public class UserExecution {
    private String userName;
    private long userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public UserExecution(String userName, long userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public UserExecution() {
    }
}
