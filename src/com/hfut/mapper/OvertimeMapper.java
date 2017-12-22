package com.hfut.mapper;

import com.hfut.bean.Overtime;
import java.util.List;

public interface OvertimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Overtime record);

    Overtime selectByPrimaryKey(Integer id);

    List<Overtime> selectAll();

    int updateByPrimaryKey(Overtime record);
}