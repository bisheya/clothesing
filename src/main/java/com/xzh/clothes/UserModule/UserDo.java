package com.xzh.clothes.UserModule;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author ：xiaonuolen
 * @date ：Created in 2019/11/5 9:13
 * @description：用户表
 * @modified By：
 * @version: $
 */
public class UserDo  implements Serializable {
    private Integer userId;
    private String userName;
    private Boolean userSex;
    private String userPhone;
    private String userAddress;
    private String userPass;
    private BigDecimal userMoney;
    private String userAuth;
    private String userTradePass;
    private String userContent;

    @Override
    public String toString() {
        return "UserDo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userPhone='" + userPhone + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userMoney=" + userMoney +
                ", userAuth='" + userAuth + '\'' +
                ", userTradePass='" + userTradePass + '\'' +
                ", userContent='" + userContent + '\'' +
                '}';
    }

    public String getUserContent() {
        return userContent;
    }

    public void setUserContent(String userContent) {
        this.userContent = userContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getUserTradePass() {
        return userTradePass;
    }

    public void setUserTradePass(String userTradePass) {
        this.userTradePass = userTradePass;
    }
}
