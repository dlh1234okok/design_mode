package com.dlh.singleton;

/**
 * @author: dulihong
 * @date: 2019/2/19 9:49
 */
public class SingletonInstance {

    private static class singleton {
        private static SingletonInstance instance = new SingletonInstance();
    }

    public static SingletonInstance getInstance() {
        return singleton.instance;
    }

}
