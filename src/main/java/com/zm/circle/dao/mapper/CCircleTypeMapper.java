package com.zm.circle.dao.mapper;

import com.zm.circle.model.CCircleType;
import com.zm.circle.model.CCircleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CCircleTypeMapper {
    long countByExample(CCircleTypeExample example);

    int deleteByExample(CCircleTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(CCircleType record);

    int insertSelective(CCircleType record);

    List<CCircleType> selectByExample(CCircleTypeExample example);

    CCircleType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CCircleType record, @Param("example") CCircleTypeExample example);

    int updateByExample(@Param("record") CCircleType record, @Param("example") CCircleTypeExample example);

    int updateByPrimaryKeySelective(CCircleType record);

    int updateByPrimaryKey(CCircleType record);
}