package com.code.review.correctCode;

import com.code.review.correctCode.Shape;
import com.code.review.correctCode.Calculator;

public class PerimeterCalculator implements Calculator {
    public double calculateTotalPerimeterOrArea(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }
}