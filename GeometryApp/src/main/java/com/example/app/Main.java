package com.example.app;

import com.example.geometry.Circle;
import com.example.geometry.GeometryUtils.GeometryUtils;
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

        //проверка 3 задания
        Circle circle1 = new Circle(5);

        System.out.println("Площадь: " + circle1.area());
        System.out.println("Периметр: " + circle1.perimeter());
        System.out.println("Диаметр: " + circle1.getDiameter());

        //проверка 4 задания
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10);

        double meters = GeometryUtils.centimetersToMeters(250);

        System.out.println("250 см = " + meters + " м");

        System.out.println(
                GeometryUtils.compareAreas(
                        circle1.area(),
                        circle2.area()
                )
        );

        System.out.println(
                "Площади кругов равны: " +
                        GeometryUtils.haveEqualArea(circle1, circle2)
        );
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