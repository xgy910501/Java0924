package com.xue.test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class FinalClassTest {
    private static final int i=1;

    private static final int ONE_TWO_THREE = 123;


    public FinalClassTest() {
//        i=2;
    }

    public static void main(String[] args) {
        FinalClassTest finalClassTest = new FinalClassTest();
//        finalClassTest.i = 1;
        System.out.println(finalClassTest.i);
        System.out.println(ONE_TWO_THREE);
    }
}
