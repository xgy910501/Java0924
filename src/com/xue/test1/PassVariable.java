package com.xue.test1;

/**
 * Created by Administrator on 2016/9/24.
 */
public class PassVariable {

    private static String str="b";

//    public void m1(String str){
//        System.out.println(str);
//        str = "a";
//        System.out.println(str);
//    }
    public void m1(PassVariable passVariable){
        System.out.println(passVariable.str);
        str= "aa";
        System.out.println(passVariable.str);
    }

    public static void main(String[] args) {
        PassVariable passVariable = new PassVariable();
        System.out.println(passVariable.str);
        passVariable.m1(passVariable);
        System.out.println(passVariable.str);
    }
}
