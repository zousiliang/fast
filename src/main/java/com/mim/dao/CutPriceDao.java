package com.mim.dao;

import com.mim.model.CutPrice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zousiliang on 19/8/30.
 */
@Mapper
public interface CutPriceDao {

    //@Insert("insert into t_cut_price(luck,created_by,created_date) values (#{luck},#{createdBy},SYSDATE())")
    @Insert("insert into t_cut_price(created_by,created_date) values (#{createdBy},SYSDATE())")
    int addCutPrice(CutPrice o);

    @Select("select id,luck,created_by  createdBy,created_date createdDate from t_cut_price")
    List<CutPrice> getCutPrice();
}
