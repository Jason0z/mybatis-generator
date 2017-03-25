package com.zm.circle.dao.mapper;

import com.zm.circle.model.LLetter;
import com.zm.circle.model.LLetterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LLetterMapper {
    long countByExample(LLetterExample example);

    int deleteByExample(LLetterExample example);

    int deleteByPrimaryKey(String id);

    int insert(LLetter record);

    int insertSelective(LLetter record);

    List<LLetter> selectByExampleWithBLOBs(LLetterExample example);

    List<LLetter> selectByExample(LLetterExample example);

    LLetter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LLetter record, @Param("example") LLetterExample example);

    int updateByExampleWithBLOBs(@Param("record") LLetter record, @Param("example") LLetterExample example);

    int updateByExample(@Param("record") LLetter record, @Param("example") LLetterExample example);

    int updateByPrimaryKeySelective(LLetter record);

    int updateByPrimaryKeyWithBLOBs(LLetter record);

    int updateByPrimaryKey(LLetter record);
}