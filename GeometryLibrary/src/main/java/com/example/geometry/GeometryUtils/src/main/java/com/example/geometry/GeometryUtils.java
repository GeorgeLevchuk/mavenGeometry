package com.example.geometry.GeometryUtils.src.main.java.com.example.geometry;

import com.example.geometry.Circle;

public class GeometryUtils {

    // Перевод сантиметров в метры
    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    // Перевод метров в сантиметры
    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    // Сравнение площади двух кругов
    public static boolean haveEqualArea(Circle c1, Circle c2) {
        return Math.abs(c1.area() - c2.area()) < 0.000001;
    }

    // Определение фигуры с большей площадью
    public static String compareAreas(double area1, double area2) {
        if (area1 > area2) {
            return "Первая фигура имеет большую площадь";
        } else if (area1 < area2) {
            return "Вторая фигура имеет большую площадь";
        } else {
            return "Площади фигур равны";
        }
    }

    public static double millimetersToCentimeters(double millimeters) {
        return millimeters / 10;
    }
}