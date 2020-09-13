package com.sut.school_mall.controller;

import com.sut.school_mall.bean.Store;
import com.sut.school_mall.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreMapper storeMapper;


    @ResponseBody
    @RequestMapping(value = "/get_all")
    public Object getAll(){
        List<Store> all = storeMapper.getAll();
        return all;
    }
}
