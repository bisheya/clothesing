package com.xzh.clothes.shopCarModule;

import java.io.Serializable;

public class ShopCarDo implements Serializable {
    private int  userId;
    private int shopList;
    private Integer num;

    @Override
    public String toString() {
        return "ShopCarDo{" +
                "userId=" + userId +
                ", shopList=" + shopList +
                ", num=" + num +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getShopList() {
        return shopList;
    }

    public void setShopList(int shopList) {
        this.shopList = shopList;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}
