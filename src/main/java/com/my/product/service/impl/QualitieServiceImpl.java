package com.my.product.service.impl;

import com.my.product.dao.QualitieMapper;
import com.my.product.dao.ResultMapper;
import com.my.product.entity.Qualitie;
import com.my.product.service.QualitieService;
import com.my.product.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class QualitieServiceImpl implements QualitieService {
    @Autowired(required = false)
    QualitieMapper qualitieMapper;
    @Autowired(required = false)
    ResultMapper resultMapper;

    @Override
    public Page<Qualitie> getQualitieList(String productName, int currPage, int pageSize) {
        Page<Qualitie> page = new Page<>();
        page.setPageSize(pageSize);
        page.setCurrPage(currPage);
        page.setTotalCount(qualitieMapper.getCount(productName));
        page.setList(qualitieMapper.getQualitieList(productName, page.getStart(), pageSize));
        return page;
    }

    @Override
    @Transactional
    public int add(Qualitie qualitie) {
        qualitieMapper.add(qualitie);
        return resultMapper.add(qualitie.getId());
    }

    @Override
    public List<Qualitie> getAll() {
        return qualitieMapper.getAll();
    }
}
