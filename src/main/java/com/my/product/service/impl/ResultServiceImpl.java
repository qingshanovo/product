package com.my.product.service.impl;

import com.my.product.dao.ResultMapper;
import com.my.product.entity.Result;
import com.my.product.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired(required = false)
    ResultMapper resultMapper;
    @Override
    public int modifyQuitlies(Result result) {
        return resultMapper.modifyQuitlies(result);
    }
}
