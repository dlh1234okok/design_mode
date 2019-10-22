package com.dlh.builder.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:38
 */
public class Director {

    private List<String> sequence = new ArrayList<>();
    private BmwBuilder bmwBuilder = new BmwBuilder();
    private BenzBuilder benzBuilder = new BenzBuilder();

    public BmwModel ABmw() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engine");
        this.sequence.add("stop");
        bmwBuilder.setSequence(this.sequence);
        return (BmwModel) this.bmwBuilder.getCarModel();
    }

    public BenzModel ABenz() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

}
