package com.dlh.builder.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:21
 */
public abstract class CarModel {

    private List<String> sequences = new ArrayList<>();

    protected abstract void engine();

    protected abstract void trumpet();

    protected abstract void start();

    protected abstract void stop();

    protected void run() {

        for (String sequence : sequences) {
            switch (sequence) {
                case "engine":
                    engine();
                    break;
                case "trumpet":
                    trumpet();
                    break;
                case "start":
                    start();
                    break;
                case "stop":
                    stop();
                    break;
            }
        }
    }

    final void setSequence(List<String> sequence) {
        this.sequences = sequence;
    }

}
