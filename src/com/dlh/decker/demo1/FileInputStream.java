package com.dlh.decker.demo1;

/**
 * @author:Dulihong
 * @create:2019-10-22
 */
public class FileInputStream implements InputStream {

    protected volatile InputStream inputStream;

    public FileInputStream() {
    }

    public FileInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void read() {
        System.out.println("fileInputStream..read");
    }
}
