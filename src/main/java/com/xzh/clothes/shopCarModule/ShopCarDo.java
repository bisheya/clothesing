package com.xzh.clothes.shopCarModule;

import java.io.Serializable;

public class ShopCarDo implements Serializable {
    private int  userId;
    private int shopList;

    @Override
    public String toString() {
        return "shopCarDo{" +
                "userId=" + userId +
                ", shopList='" + shopList + '\'' +
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
}
