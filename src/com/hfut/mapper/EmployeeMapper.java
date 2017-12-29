package com.hfut.mapper;

import org.apache.ibatis.annotations.Param;

import com.hfut.bean.Employee;

public interface EmployeeMapper extends BaseMapper<Employee>{
	public Employee loginVerify(@Param("username")String username,@Param("password")String password);

}