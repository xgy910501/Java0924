package com.xue.test;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/9/24.
 */
public abstract class Shape {
    public abstract void zhouChang();
    public abstract void mianJi();
}

    class Circle extends Shape {
        private double pi=3.14;
        private int r = 5;
        @Override
        public void zhouChang() {
            System.out.println("圆的周长为："+(2*pi*r));
        }

        @Override
        public void mianJi() {
            System.out.println("圆的面积为："+pi*(r*r));
        }
    }

    class Square extends Shape{
        private int b = 5;
        @Override
        public void zhouChang() {
            System.out.println("正方形周长为："+4*b);
        }

        @Override
        public void mianJi() {
            System.out.println("正方形面积为："+(b*b));
        }
    }

    class Rectangle extends Shape{
        private int c = 10;
        private int k = 5;

        @Override
        public void zhouChang() {
            System.out.println("长方形周长为："+(2*(c+k)));
        }

        @Override
        public void mianJi() {
            System.out.println("长方形面积为："+(c*k));
        }
    }

    class Triangle extends Shape{
        private int b1 = 3;
        private int b2= 4;
        private int b3 = 5;
        @Override
        public void zhouChang() {
            System.out.println("三角形周长为："+(b1+b2+b3));
        }

        @Override
        public void mianJi() {
            System.out.println("三角形面积为："+(b1*b2/2));
        }
    }

