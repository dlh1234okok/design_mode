package com.dlh.builder.demo;

import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:32
 */
public class BmwBuilder extends CarBuilder {

    private BmwModel bmwModel = new BmwModel();

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }

    @Override
    public void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }
}
