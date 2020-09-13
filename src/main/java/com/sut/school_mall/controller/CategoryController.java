package com.sut.school_mall.controller;


import com.sut.school_mall.bean.Category;
import com.sut.school_mall.bean.FullCategory;
import com.sut.school_mall.bean.Good;
import com.sut.school_mall.mapper.CategoryMapper;
import com.sut.school_mall.mapper.GoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Category")
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    GoodMapper goodMapper;

    @ResponseBody
    @RequestMapping("/getAll")
    public Object getAll(@RequestParam("storeName") String storeName){
        List<Category> allCategory = categoryMapper.getAllCategory(storeName);

        List<FullCategory> fullCategories = new ArrayList<FullCategory>();

        for (Category category : allCategory){
            List<Good> allGoods = goodMapper.getAllGoods(category.getCatType(), storeName);
            FullCategory fullCategory = new FullCategory(allGoods, category);
            fullCategories.add(fullCategory);
        }

        return fullCategories;
    }

}
