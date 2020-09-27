package com.sut.school_mall.mapper;


import com.sut.school_mall.bean.Store;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StoreMapper {
   public List<Store> getAll();

}
