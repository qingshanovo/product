package com.my.product.dao;

import com.my.product.entity.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ResultMapper {
    int modifyQuitlies(Result result);
    int add(int productId);
}
