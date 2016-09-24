package com.xue.test1;

/**
 * Created by Administrator on 2016/9/24.
 */
public class ScopeClassTest {
    private int i;
    private String str;

    public void m1(){
        System.out.println(i);
    }

    public void m2(){
        String str = "a";
        System.out.println(str);
    }

    public void m3(){
        for(int k=1;k<10;k++){
            System.out.println(k);
        }
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        int i =1;
        ScopeClassTest scopeClassTest = new ScopeClassTest();
        scopeClassTest.m1();
        scopeClassTest.m2();
        scopeClassTest.m3();
        System.out.println(i);
    }

}
