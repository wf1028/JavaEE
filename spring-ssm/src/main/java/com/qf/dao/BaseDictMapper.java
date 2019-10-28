package com.qf.dao;

import com.qf.entity.BaseDict;

import java.util.List;

public interface BaseDictMapper {
    List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
}
