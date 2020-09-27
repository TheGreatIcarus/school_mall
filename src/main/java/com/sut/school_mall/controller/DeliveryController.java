package com.sut.school_mall.controller;


import com.sut.school_mall.bean.Delivery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/Delivery")
@Controller
public class DeliveryController {

    @PostMapping("/insertDelivery")
    public void insertDelivery(Delivery delivery){
        System.out.println(delivery);
    }
}
