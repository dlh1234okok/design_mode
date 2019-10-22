package com.dlh.builder.demo;

/**
 * @author: dulihong
 * @date: 2019/2/14 14:35
 */
public class Client {

    public static void main(String[] args) {

        /*BmwBuilder bmwBuilder = new BmwBuilder();
        List<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("engine");
        sequence.add("trumpet");
        sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        CarModel carModel = bmwBuilder.getCarModel();
        carModel.run();*/

        Director director = new Director();
        director.ABmw().run();
        director.ABenz().run();
    }

}
