package com.dlh.singleton;

/**
 * @author: dulihong
 * @date: 2019/2/19 9:52
 */
public class Client {

    public static void main(String[] args) {
        SingletonInstance s = SingletonInstance.getInstance();
        SingletonInstance s2 = SingletonInstance.getInstance();
        System.out.println(s==s2);
    }

}
