package com.qf.service;

import com.qf.entity.BaseDict;

import java.util.List;

public interface BaseDictService {
    List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode);
}
