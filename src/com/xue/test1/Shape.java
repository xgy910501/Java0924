package com.xue.test1;

/**
 * Created by Administrator on 2016/9/24.
 */
public interface Shape {

    double getPerimeter();
    double getArea();
}

class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}

class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}

class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}

class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if((a+b>c && Math.abs(a-b)<c)|| (a+c>b && Math.abs(a-c)<b) || (b+c>a && Math.abs(b-c)<a)){
            this.a = a;
            this.b = b;
            this.c = c;
        }else{
            System.out.println("不满足三角形组成条件");
        }
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        double d = (a+b+c)/2;
        return Math.sqrt(d*(d-a)*(d-b)*(d-c));
    }
}

class Test {
    public static void main(String[] args) {

        Circle circle= new Circle(5);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        Square square = new Square(5);
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}

