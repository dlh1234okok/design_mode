package com.dlh.builder.example.builder;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: dulihong
 * @date: 2019/2/15 13:43
 */
public class InsertBuilder extends EntityBuilder {

    private Class clz;

    @Override
    protected List<String> getFiledName() {
        return Arrays.stream(clz.getDeclaredFields())
                .filter(field -> !field.getName().equals("id"))
                .map(Field::getName)
                .collect(Collectors.toList());
    }

    @Override
    protected List<String> getMethodName() {
        return getFiledName().stream()
                .map(s -> {
                    if (s.equals("name")) {
                        return "get" + s;
                    } else {
                        return "get" + s.substring(0, 1).toUpperCase() + s.substring(1);
                    }
                })
                .collect(Collectors.toList());
    }

    @Override
    protected Object[] getResult(Object entity) {
        return getMethodName().stream()
                //.filter(s -> !s.contains("id"))
                .map(s -> {
                    try {
                        return clz.getMethod(s).invoke(entity);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                }).toArray();
    }


    @Override
    protected void setClz(Class clz) {
        this.clz = clz;
    }
}
