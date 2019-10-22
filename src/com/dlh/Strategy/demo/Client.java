package com.dlh.Strategy.demo;

/**
 * @author: dulihong
 * @date: 2019/6/5 16:47
 */
public class Client {

    public static void main(String[] args) {
        Service service = new Service();
        service.myMethod(new StrategyA());
        System.out.println("===");
        service.myMethod(new StrategyB());
    }

}
