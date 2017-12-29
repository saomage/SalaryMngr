package com.hfut.mapper;

import org.apache.ibatis.annotations.Param;

import com.hfut.bean.Admin;

public interface AdminMapper extends BaseMapper<Admin>{
	public Admin loginVerify(@Param("username")String username,@Param("password")String password);
}