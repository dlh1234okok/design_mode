package com.dlh.builder.demo;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:47
 */
public class BenzModel extends CarModel{
    @Override
    protected void engine() {
        System.out.println("Benz引擎...");
    }

    @Override
    protected void trumpet() {
        System.out.println("Benz喇叭...");
    }

    @Override
    protected void start() {
        System.out.println("Benz启动");
    }

    @Override
    protected void stop() {
        System.out.println("Benz停止");
    }
}
