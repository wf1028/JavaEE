package com.qf.service.impl;

import com.qf.dao.BaseDictMapper;
import com.qf.entity.BaseDict;
import com.qf.service.BaseDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService {

    @Resource(name="baseDictMapper")
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> queryBaseDictByDictTypeCode(String dictTypeCode) {

        List<BaseDict> list = baseDictMapper.queryBaseDictByDictTypeCode(dictTypeCode);

        return list;
    }

}