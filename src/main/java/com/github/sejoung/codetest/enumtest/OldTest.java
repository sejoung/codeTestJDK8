package com.github.sejoung.codetest.enumtest;

public class OldTest {
    public static void main(String[] args) {

        OldTest ot = new OldTest();

        ot.orangeShow(Constants.ORANGE_BLOOD,Constants.ORANGE_NAVEL,Constants.APPLE_FUJI);

    }

    public void orangeShow(int ...orangeType){
        for (int orange : orangeType){
            System.out.println(orange);
        }
    }
}
