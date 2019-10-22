package com.dlh.builder.demo;

import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:20
 */
public abstract class CarBuilder {

    public abstract CarModel getCarModel();

    public abstract void setSequence(List<String> sequence);

}
