package com.my.product.service;

import com.my.product.entity.Qualitie;
import com.my.product.util.Page;

import java.util.List;

public interface QualitieService {
    Page<Qualitie> getQualitieList(String productName, int currPage, int pageSize);
    int add(Qualitie qualitie);
    List<Qualitie> getAll();

}
