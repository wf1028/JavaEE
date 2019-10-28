package com.yiguo.dao;

import com.yiguo.entity.YouCoin;
import com.yiguo.entity.YouCoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YouCoinMapper {
    int countByExample(YouCoinExample example);

    int deleteByExample(YouCoinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YouCoin record);

    int insertSelective(YouCoin record);

    List<YouCoin> selectByExample(YouCoinExample example);

    YouCoin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YouCoin record, @Param("example") YouCoinExample example);

    int updateByExample(@Param("record") YouCoin record, @Param("example") YouCoinExample example);

    int updateByPrimaryKeySelective(YouCoin record);

    int updateByPrimaryKey(YouCoin record);
}