package com.sut.school_mall.mapper;


import com.sut.school_mall.bean.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CategoryMapper {
    List<Category> getAllCategory(String storeName);
}
