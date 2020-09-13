package com.sut.school_mall.bean;

import java.util.List;

public class FullCategory {
    List<Good> dbGoods;
    Category dbCategory;

    public FullCategory(List<Good> dbGoods, Category dbCategory) {
        this.dbGoods = dbGoods;
        this.dbCategory = dbCategory;
    }

    @Override
    public String toString() {
        return "FullCategory{" +
                "dbGoods=" + dbGoods +
                ", dbCategory=" + dbCategory +
                '}';
    }

    public List<Good> getDbGoods() {
        return dbGoods;
    }

    public void setDbGoods(List<Good> dbGoods) {
        this.dbGoods = dbGoods;
    }

    public Category getDbCategory() {
        return dbCategory;
    }

    public void setDbCategory(Category dbCategory) {
        this.dbCategory = dbCategory;
    }
}
