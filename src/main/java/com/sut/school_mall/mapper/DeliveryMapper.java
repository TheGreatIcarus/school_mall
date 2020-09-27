package com.sut.school_mall.mapper;

import com.sut.school_mall.bean.Delivery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface DeliveryMapper {
    public void insertDelivery(Delivery delivery);

    public Delivery selAllDelivery();

    public Delivery selDeliveryBy();
}
