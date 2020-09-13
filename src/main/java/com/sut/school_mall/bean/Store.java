package com.sut.school_mall.bean;

public class Store {
    private Integer storeId;

    private String storeName;

    private String storeTime;

    private String storeImg;

    private String storeTitle;

    public Store(Integer storeId, String storeName, String storeTime, String storeImg, String storeTitle) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeTime = storeTime;
        this.storeImg = storeImg;
        this.storeTitle = storeTitle;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeTime='" + storeTime + '\'' +
                ", storeImg='" + storeImg + '\'' +
                ", storeTitle='" + storeTitle + '\'' +
                '}';
    }

    public String getStoreTitle() {
        return storeTitle;
    }

    public void setStoreTitle(String storeTitle) {
        this.storeTitle = storeTitle;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime;
    }

    public String getStoreImg() {
        return storeImg;
    }

    public void setStoreImg(String storeImg) {
        this.storeImg = storeImg;
    }

    public Store(Integer storeId, String storeName, String storeTime, String storeImg) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeTime = storeTime;
        this.storeImg = storeImg;
    }

    public Store() {
        super();
    }
}
