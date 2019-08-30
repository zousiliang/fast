package com.mim.model;

import java.util.Date;

/**
 * Created by zousiliang on 19/8/30.
 */
public class CutPrice {

    private String id;

    //幸运值
    private String luck;

    //创建的人
    private String createdBy;

    //创建时间
    private  String    createdDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLuck() {
        return luck;
    }

    public void setLuck(String luck) {
        this.luck = luck;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
