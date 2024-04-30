package com.code.review.correctCode;

import com.code.review.correctCode.Shape;
import com.code.review.correctCode.Calculator;

public class AreaCalculator implements Calculator {
    public double calculateTotalPerimeterOrArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}