package org.naozi.sakamichi.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.naozi.sakamichi.dao.model.Guest;
import org.naozi.sakamichi.dao.model.GuestExample;

public interface GuestMapper {
    int countByExample(GuestExample example);

    int deleteByExample(GuestExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Guest record);

    int insertSelective(Guest record);

    List<Guest> selectByExample(GuestExample example);

    Guest selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Guest record, @Param("example") GuestExample example);

    int updateByExample(@Param("record") Guest record, @Param("example") GuestExample example);

    int updateByPrimaryKeySelective(Guest record);

    int updateByPrimaryKey(Guest record);
}