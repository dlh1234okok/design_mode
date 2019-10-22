package com.dlh.decker.demo1;

/**
 * 装饰者模式
 * @author:Dulihong
 * @create:2019-10-22
 */
public class Client {

    public static void main(String[] args) {
        InputStream inputStream = new FileInputStream();
        BuffedInputStream bi = new BuffedInputStream(inputStream);
        inputStream.read();
        bi.read();
        bi.buffedRead();
    }

}
