package com.mim.controller;

import com.mim.model.CutPrice;
import com.mim.service.CutPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zousiliang on 19/8/30.
 */
@RestController
@RequestMapping("/curPrice")
public class CutPriceController {


    @Autowired
    private CutPriceService cutPriceService;

    @RequestMapping("add")
    public CutPrice addOrder(CutPrice o){
        int luck=(int)(Math.random()*100)+1;;
        o.setLuck(Integer.toString(luck));
        if (null==o.getCreatedBy()){
            o.setCreatedBy("God");
        }
        this.cutPriceService.addCutPrice(o);

        return o;
    }

    @RequestMapping("all")
    public List<CutPrice> getOrder(){
        return cutPriceService.getCutPrice();
    }
}
