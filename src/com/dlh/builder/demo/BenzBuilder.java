package com.dlh.builder.demo;

import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:46
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }

    @Override
    public void setSequence(List<String> sequence) {
        benzModel.setSequence(sequence);
    }
}
