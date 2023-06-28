package com.my.product.controller;

import com.my.product.entity.Qualitie;
import com.my.product.entity.Result;
import com.my.product.service.QualitieService;
import com.my.product.service.ResultService;
import com.my.product.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private QualitieService qualitieService;
    @Autowired
    private ResultService resultService;
    @GetMapping("/getPage")
    public Page<Qualitie> index(@RequestParam(value = "productName" ,required = false) String productName,
                                @RequestParam(value = "currPage",required = false,defaultValue = "1") int currPage,
                                @RequestParam(value = "pageSize",required = false,defaultValue = "3")int pageSize){
        return  qualitieService.getQualitieList(productName, currPage, pageSize);
    }
    @PostMapping("/add")
    public boolean add(Qualitie qualitie){
        return qualitieService.add(qualitie)==1;
    }

    @GetMapping ("/getAll")
    public List<Qualitie> getAll(Qualitie qualitie){
        return qualitieService.getAll();
    }

    @GetMapping ("/modifiy")
    public boolean modifiy(Result result){
        return resultService.modifyQuitlies(result)==1;
    }

}
