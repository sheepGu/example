package com.exam.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Tman on 2017/3/31.
 * 主要用于MD5的密码加密
 * 采用MD5 32位加密算法
 */
public class Md5Util {
    public static String getMD5(String str){
        String temp="";
        try {
            MessageDigest messageDigest= MessageDigest.getInstance("md5");
            byte[] bytes=messageDigest.digest(str.getBytes());
            int i;
            StringBuffer stringBuffer=new StringBuffer("");
            for(int offset=0;offset< bytes.length;offset++){
                i=bytes[offset];
                if(i<0)
                    i +=256;
                if(i<16)
                    stringBuffer.append("0");
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String [] args){
        String needMd5String="123456";
        System.out.println(Md5Util.getMD5(needMd5String));
    }
}
