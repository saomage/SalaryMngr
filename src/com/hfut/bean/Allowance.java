package com.hfut.bean;

import com.google.gson.Gson;
import java.io.Serializable;

/**
 * @author 
 */
public class Allowance implements Serializable {
    private Integer id;

    private Double pay;

    private String remarks;

    private Integer basicSalaryId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getBasicSalaryId() {
        return basicSalaryId;
    }

    public void setBasicSalaryId(Integer basicSalaryId) {
        this.basicSalaryId = basicSalaryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pay=").append(pay);
        sb.append(", remarks=").append(remarks);
        sb.append(", basicSalaryId=").append(basicSalaryId);
        sb.append("]");
        return sb.toString();
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}