package com.example.geometry.threedimensional;

public class Sphere implements ThreeDimensionalShape {

    private final double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(
                    "Радиус сферы должен быть больше 0"
            );
        }

        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}