package com.hfut.bean;

import com.google.gson.Gson;
import java.io.Serializable;

/**
 * @author 
 */
public class CheckOff implements Serializable {
    private Integer id;

    private Double tax;

    private Double insurance;

    private Double housingFund;

    private Integer basicSalaryId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getHousingFund() {
        return housingFund;
    }

    public void setHousingFund(Double housingFund) {
        this.housingFund = housingFund;
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
        sb.append(", tax=").append(tax);
        sb.append(", insurance=").append(insurance);
        sb.append(", housingFund=").append(housingFund);
        sb.append(", basicSalaryId=").append(basicSalaryId);
        sb.append("]");
        return sb.toString();
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}