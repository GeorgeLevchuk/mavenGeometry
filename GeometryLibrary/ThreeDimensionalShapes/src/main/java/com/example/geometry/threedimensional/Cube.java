package com.example.geometry.threedimensional;

public class Cube implements ThreeDimensionalShape {

    private final double side;

    public Cube(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException(
                    "Сторона куба должна быть больше 0"
            );
        }

        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    public double getSide() {
        return side;
    }
}