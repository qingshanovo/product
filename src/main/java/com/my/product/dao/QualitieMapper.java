package com.my.product.dao;

import com.my.product.entity.Qualitie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QualitieMapper {
    List<Qualitie> getQualitieList(@Param("productName") String productName,
                                   @Param("startIndex") int startIndex,
                                   @Param("pageSize") int pageSize);
    int getCount(@Param("productName") String productName);
    int add(Qualitie qualitie);
    List<Qualitie> getAll();

}
