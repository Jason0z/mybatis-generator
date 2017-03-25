package com.zm.circle.dao.mapper;

import com.zm.circle.model.CCircle;
import com.zm.circle.model.CCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CCircleMapper {
    long countByExample(CCircleExample example);

    int deleteByExample(CCircleExample example);

    int deleteByPrimaryKey(String id);

    int insert(CCircle record);

    int insertSelective(CCircle record);

    List<CCircle> selectByExample(CCircleExample example);

    CCircle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CCircle record, @Param("example") CCircleExample example);

    int updateByExample(@Param("record") CCircle record, @Param("example") CCircleExample example);

    int updateByPrimaryKeySelective(CCircle record);

    int updateByPrimaryKey(CCircle record);
}