package com.shizu.entity;

import java.io.Serializable;

public class Company implements Serializable {
    private Integer ID;// 数据库编号
    private String COMPANYID;//公司ID
    private String COMPANYNAME;//公司名称

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCOMPANYID() {
        return COMPANYID;
    }

    public void setCOMPANYID(String COMPANYID) {
        this.COMPANYID = COMPANYID;
    }

    public String getCOMPANYNAME() {
        return COMPANYNAME;
    }

    public void setCOMPANYNAME(String COMPANYNAME) {
        this.COMPANYNAME = COMPANYNAME;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", COMPANYID='" + COMPANYID + '\'' +
                ", COMPANYNAME='" + COMPANYNAME + '\'' +
                '}';
    }
}
