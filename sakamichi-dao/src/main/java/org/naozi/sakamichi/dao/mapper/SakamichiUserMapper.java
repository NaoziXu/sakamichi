package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.SakamichiUser;
import org.naozi.sakamichi.dao.model.SakamichiUserExample;

public interface SakamichiUserMapper {
    int countByExample(SakamichiUserExample example);

    int deleteByExample(SakamichiUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SakamichiUser record);

    int insertSelective(SakamichiUser record);

    List<SakamichiUser> selectByExample(SakamichiUserExample example);

    SakamichiUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SakamichiUser record, @Param("example") SakamichiUserExample example);

    int updateByExample(@Param("record") SakamichiUser record, @Param("example") SakamichiUserExample example);

    int updateByPrimaryKeySelective(SakamichiUser record);

    int updateByPrimaryKey(SakamichiUser record);
}