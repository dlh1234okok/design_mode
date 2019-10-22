package com.dlh.builder.demo;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:33
 */
public class BmwModel extends CarModel {


    @Override
    protected void engine() {
        System.out.println("bmw引擎...");
    }

    @Override
    protected void trumpet() {
        System.out.println("bmw喇叭");
    }

    @Override
    protected void start() {
        System.out.println("bmw启动");
    }

    @Override
    protected void stop() {
        System.out.println("bmw停止");
    }
}
