package com.example.app;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Shape;
import com.example.geometry.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        printInfo("Круг", circle);
        printInfo("Прямоугольник", rectangle);
        printInfo("Треугольник", triangle);
    }

    private static void printInfo(String name, Shape shape) {
        System.out.printf(
                "%s: площадь = %.2f, периметр = %.2f%n",
                name,
                shape.area(),
                shape.perimeter()
        );
    }
}