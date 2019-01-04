package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.Microblog;
import org.naozi.sakamichi.dao.model.MicroblogExample;

public interface MicroblogMapper {
    int countByExample(MicroblogExample example);

    int deleteByExample(MicroblogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Microblog record);

    int insertSelective(Microblog record);

    List<Microblog> selectByExample(MicroblogExample example);

    Microblog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Microblog record, @Param("example") MicroblogExample example);

    int updateByExample(@Param("record") Microblog record, @Param("example") MicroblogExample example);

    int updateByPrimaryKeySelective(Microblog record);

    int updateByPrimaryKey(Microblog record);
}