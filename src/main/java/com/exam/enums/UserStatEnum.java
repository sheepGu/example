package com.exam.enums;

/**
 * Created by Tman on 2017/4/2.
 */
public enum UserStatEnum {
    SUCCESS(1,"登录成功！"),
    NOSUCHUSER(0,"用户不存在！"),
    INNER_ERROR(-2,"系统异常！"),
    REPEATUSER(-3,"用户重复！"),
    ERROR(-1,"账号或密码有误！");


    private int state;
    private String stateInfo;

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    UserStatEnum(int state,String stateInfo) {
        this.state=state;
        this.stateInfo=stateInfo;
    }

    public static UserStatEnum stateOf(int index){
        for (UserStatEnum userStatEnum:values()){
            if (userStatEnum.getState()==index){
                return userStatEnum;
            }
        }
        return null;
    }


}
