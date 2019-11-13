package com.xzh.clothes.CommodityModule;

import com.baomidou.mybatisplus.annotation.TableField;
import org.springframework.web.multipart.MultipartFile;

import java.beans.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CommodityDo implements Serializable {
    private int commodityId;
    private String commodityName;
    private byte[] commodityImage;
    private BigDecimal commodityPrice;
    private String commodityColor;
    private String commoditySize;
    private int commodityNum;
    private String commodityDesc;
    private Date  commodityDate;
    private String commodityBrand;
    @TableField(exist = false)
    private Integer num;


    @Override
    public String toString() {
        return "CommodityDo{" +
                "commodityId=" + commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", commodityImage='" + commodityImage + '\'' +
                ", commodityPrice=" + commodityPrice +
                ", commodityColor='" + commodityColor + '\'' +
                ", commoditySize='" + commoditySize + '\'' +
                ", commodityNum=" + commodityNum +
                ", commodityDesc='" + commodityDesc + '\'' +
                ", commodityDate=" + commodityDate +
                ", commodityBrand='" + commodityBrand + '\'' +
                '}';
    }

    public int getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(int commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public byte[] getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(byte[] commodityImage) {
        this.commodityImage = commodityImage;
    }

    public BigDecimal getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(BigDecimal commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityColor() {
        return commodityColor;
    }

    public void setCommodityColor(String commodityColor) {
        this.commodityColor = commodityColor;
    }

    public String getCommoditySize() {
        return commoditySize;
    }

    public void setCommoditySize(String commoditySize) {
        this.commoditySize = commoditySize;
    }

    public int getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(int commodityNum) {
        this.commodityNum = commodityNum;
    }

    public String getCommodityDesc() {
        return commodityDesc;
    }

    public void setCommodityDesc(String commodityDesc) {
        this.commodityDesc = commodityDesc;
    }

    public Date getCommodityDate() {
        return commodityDate;
    }

    public void setCommodityDate(Date commodityDate) {
        this.commodityDate = commodityDate;
    }

    public String getCommodityBrand() {
        return commodityBrand;
    }

    public void setCommodityBrand(String commodityBrand) {
        this.commodityBrand = commodityBrand;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
