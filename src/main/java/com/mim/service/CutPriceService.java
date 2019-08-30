package com.mim.service;

import com.mim.dao.CutPriceDao;
import com.mim.model.CutPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zousiliang on 19/8/30.
 */
@Service
public class CutPriceService {

    @Autowired
    private CutPriceDao cutPriceDao;


    public void addCutPrice(CutPrice o){
        this.cutPriceDao.addCutPrice(o);
    }


    public List<CutPrice> getCutPrice(){
        return this.cutPriceDao.getCutPrice();
    }
}
