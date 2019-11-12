package com.xzh.clothes.Trade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeDo implements Serializable {
    private String tradeId;
    private int userId;
    private Date tradeDate;
    private BigDecimal tradeMoney;
    private String tradeAddress;
    private String shopList;
    private int tradeState;

    @Override
    public String toString() {
        return "TradeDo{" +
                "tradeId='" + tradeId + '\'' +
                ", userId=" + userId +
                ", tradeDate=" + tradeDate +
                ", tradeMoney=" + tradeMoney +
                ", tradeAddress='" + tradeAddress + '\'' +
                ", shopList='" + shopList + '\'' +
                ", tradeState=" + tradeState +
                '}';
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public BigDecimal getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(BigDecimal tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public String getTradeAddress() {
        return tradeAddress;
    }

    public void setTradeAddress(String tradeAddress) {
        this.tradeAddress = tradeAddress;
    }

    public String getShopList() {
        return shopList;
    }

    public void setShopList(String shopList) {
        this.shopList = shopList;
    }

    public int getTradeState() {
        return tradeState;
    }

    public void setTradeState(int tradeState) {
        this.tradeState = tradeState;
    }
}
