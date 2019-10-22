package com.dlh.builder.example.builder;

import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/2/15 13:27
 */
public abstract class EntityBuilder {

    private Class clz;

    protected abstract List<String> getFiledName();

    protected abstract List<String> getMethodName();

    protected abstract Object[] getResult(Object entity) ;


    protected void setClz(Class clz) {
        this.clz = clz;
    }


}
