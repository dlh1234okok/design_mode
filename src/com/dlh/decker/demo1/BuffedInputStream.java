package com.dlh.decker.demo1;

/**
 * @author:Dulihong
 * @create:2019-10-22
 */
public class BuffedInputStream extends FileInputStream {

    public BuffedInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void read() {
        System.out.println("read...buffed");
        super.read();
    }

    public void buffedRead(){
        System.out.println("buffedRead...");
    }

}
