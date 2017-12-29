package com.hfut.bean;

import java.io.Serializable;

/**
 * @author 
 */
public class CheckOff implements Serializable {
    private Integer id;

    private Double tax;

    private Double insurance;

    private Double housingFund;

    private BasicSalary basicSalary;

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

        sb.append("]");
        return sb.toString();
    }



	public BasicSalary getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(BasicSalary basicSalary) {
		this.basicSalary = basicSalary;
	}
}