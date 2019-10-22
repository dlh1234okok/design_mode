package com.dlh.builder.example.builder;

import com.dlh.builder.example.entity.UserEntity;

import java.util.Arrays;

/**
 * @author: dulihong
 * @date: 2019/2/15 14:33
 */
public class Client {

    public static void main(String[] args) {

        EntityBuilder builder = new InsertBuilder();
        UserEntity userEntity = new UserEntity();
        userEntity.setId("1");
        userEntity.setName("ss");
        userEntity.setPwd("123");
        userEntity.setCard("123456");
        builder.setClz(userEntity.getClass());
        //Arrays.stream(builder.getResult()).forEach(System.out::println);
       builder.getFiledName().forEach(System.out::println);
        builder.getMethodName().forEach(System.out::println);
        Arrays.stream(builder.getResult(userEntity)).forEach(System.out::println);
    }

}
