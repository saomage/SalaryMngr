package com.hfut.mapper;

import com.hfut.bean.CheckOff;
import java.util.List;

public interface CheckOffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckOff record);

    CheckOff selectByPrimaryKey(Integer id);

    List<CheckOff> selectAll();

    int updateByPrimaryKey(CheckOff record);
}