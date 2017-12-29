package com.hfut.bean;

import java.util.List;
import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class BasicSalary implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;

	private Date releaseDate;

	private Employee employee;

	private List<Allowance> allowances;
	private List<Overtime> overTimes;
	private List<CheckOff> checkOffs;

	public List<Allowance> getAllowances() {
		return allowances;
	}

	public void setAllowances(List<Allowance> allowances) {
		this.allowances = allowances;
	}

	public List<Overtime> getOverTimes() {
		return overTimes;
	}

	public void setOverTimes(List<Overtime> overTimes) {
		this.overTimes = overTimes;
	}

	public List<CheckOff> getCheckOffs() {
		return checkOffs;
	}

	public void setCheckOffs(List<CheckOff> checkOffs) {
		this.checkOffs = checkOffs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", releaseDate=").append(releaseDate);
		sb.append("]");
		return sb.toString();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}