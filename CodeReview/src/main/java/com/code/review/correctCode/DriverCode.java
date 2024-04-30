package com.code.review.correctCode;

public class DriverCode {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println(rectangle.calculatePerimeter());

        AreaCalculator ac = new AreaCalculator();
        CaclulatorImpl caclulator = new CaclulatorImpl(ac);

    }
}
