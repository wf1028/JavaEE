package com.qf.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Data
@Component
public class CollectionDemo {
    @Value("123")
    private Integer[] integer;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public CollectionDemo(Integer[] integer, List list, Set set, Map map, Properties properties) {
        this.integer = integer;
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }

    public CollectionDemo() {
    }

    @Override
    public String toString() {
        return "CollectionDemo{" +
                "integer=" + Arrays.toString(integer) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
