package com.sut.school_mall.bean;

public class Category {
    private int catId;
    private String catName;
    private String catType;
    private String storeName;

    public Category(int catId, String catName, String catType, String storeName) {
        this.catId = catId;
        this.catName = catName;
        this.catType = catType;
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catId=" + catId +
                ", catName='" + catName + '\'' +
                ", catType='" + catType + '\'' +
                ", storeName='" + storeName + '\'' +
                '}';
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
