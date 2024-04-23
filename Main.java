package com.intern.java;

class Shape {
    public double calculateArea() {
        return 0.0;
    }

    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public void display() {
        System.out.println("This is a rectangle.");
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public void display() {
        System.out.println("This is a triangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8);

        System.out.println("Circle Area: " + circle.calculateArea());
        circle.display();

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        rectangle.display();

        System.out.println("Triangle Area: " + triangle.calculateArea());
        triangle.display();
    }
}

