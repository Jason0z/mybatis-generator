package com.zm.circle.dao.mapper;

import com.zm.circle.model.PPost;
import com.zm.circle.model.PPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PPostMapper {
    long countByExample(PPostExample example);

    int deleteByExample(PPostExample example);

    int deleteByPrimaryKey(String id);

    int insert(PPost record);

    int insertSelective(PPost record);

    List<PPost> selectByExampleWithBLOBs(PPostExample example);

    List<PPost> selectByExample(PPostExample example);

    PPost selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PPost record, @Param("example") PPostExample example);

    int updateByExampleWithBLOBs(@Param("record") PPost record, @Param("example") PPostExample example);

    int updateByExample(@Param("record") PPost record, @Param("example") PPostExample example);

    int updateByPrimaryKeySelective(PPost record);

    int updateByPrimaryKeyWithBLOBs(PPost record);

    int updateByPrimaryKey(PPost record);
}