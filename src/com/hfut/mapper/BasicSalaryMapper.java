package com.hfut.mapper;

import com.hfut.bean.BasicSalary;
import java.util.List;

public interface BasicSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BasicSalary record);

    BasicSalary selectByPrimaryKey(Integer id);

    List<BasicSalary> selectAll();

    int updateByPrimaryKey(BasicSalary record);
}