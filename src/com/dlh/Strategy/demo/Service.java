package com.dlh.Strategy.demo;

/**
 * @author: dulihong
 * @date: 2019/6/5 16:46
 */
public class Service {

    public void myMethod(StrategyI strategyI) {
        System.out.println("method..before");
        strategyI.addMethod();
        System.out.println("method..end");
    }

}
