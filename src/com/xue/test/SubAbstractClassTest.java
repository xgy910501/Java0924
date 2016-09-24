package com.xue.test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class SubAbstractClassTest extends AbstractClassTest {
    @Override
    public String test(String str) {
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        SubAbstractClassTest sub = new SubAbstractClassTest();
        sub.method();
        sub.test("实现方法");
    }

}
