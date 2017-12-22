package com.hfut.bean;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Absense implements Serializable {
    private Integer id;

    private Date date;

    private BasicSalary basicSalary;

    private String type;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", type=").append(type);
        sb.append(", remarks=").append(remarks);
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