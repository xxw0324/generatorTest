package com.zhongpin.inventory.persist.auto.mapper;

import com.zhongpin.inventory.persist.auto.entity.SolrtestTest;
import com.zhongpin.zp.persist.base.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

public interface SolrtestTestMapper extends BaseMapper<SolrtestTest> {
    int deleteByPrimaryKey(String id);

    int selectCountByMap(Map<Object, Object> map);

    List<SolrtestTest> selectListByMap(Map<Object, Object> map);

    int insert(SolrtestTest record);

    int insertSelective(SolrtestTest record);

    SolrtestTest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SolrtestTest record);

    int updateByPrimaryKey(SolrtestTest record);
}