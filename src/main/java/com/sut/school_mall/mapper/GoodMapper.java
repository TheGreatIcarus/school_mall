package com.sut.school_mall.mapper;

import com.sut.school_mall.bean.Good;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface GoodMapper {
    List<Good> getAllGoods(String goodType, String goodStore);
}
