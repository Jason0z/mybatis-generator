package com.zm.circle.dao.mapper;

import com.zm.circle.model.UUserCircle;
import com.zm.circle.model.UUserCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserCircleMapper {
    long countByExample(UUserCircleExample example);

    int deleteByExample(UUserCircleExample example);

    int deleteByPrimaryKey(String id);

    int insert(UUserCircle record);

    int insertSelective(UUserCircle record);

    List<UUserCircle> selectByExample(UUserCircleExample example);

    UUserCircle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UUserCircle record, @Param("example") UUserCircleExample example);

    int updateByExample(@Param("record") UUserCircle record, @Param("example") UUserCircleExample example);

    int updateByPrimaryKeySelective(UUserCircle record);

    int updateByPrimaryKey(UUserCircle record);
}