package com.sut.school_mall.bean;

public class Good {
    private int goodId;
    private String goodName;
    private String goodPrice;
    private String goodImg;
    private String goodType;
    private String goodStore;

    public Good(int goodId, String goodName, String goodPrice, String goodImg, String goodType, String goodStore) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.goodImg = goodImg;
        this.goodType = goodType;
        this.goodStore = goodStore;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodPrice='" + goodPrice + '\'' +
                ", goodImg='" + goodImg + '\'' +
                ", goodType='" + goodType + '\'' +
                ", goodStore='" + goodStore + '\'' +
                '}';
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(String goodPrice) {
        this.goodPrice = goodPrice;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public String getGoodStore() {
        return goodStore;
    }

    public void setGoodStore(String goodStore) {
        this.goodStore = goodStore;
    }
}
