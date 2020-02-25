package com.epam.homework7;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangleRed = new Rectangle("red", 20.1, 10.3);
        Rectangle rectangleGreen = new Rectangle("green", 25, 5.4);
        Rectangle rectangleBlue = new Rectangle("blue", 15.7, 30.3);

        Circle circleRed = new Circle("red", 12.5);
        Circle circleGreen = new Circle("green", 7.7);
        Circle circleBlue = new Circle("blue", 3.8);

        Triangle triangleGreen = new Triangle("green", 5, 7, 3);
        Triangle triangleYellow = new Triangle("yellow", 7.8, 9.3, 10.9);

        Shape[] figures = {
                rectangleBlue, rectangleGreen, rectangleRed,
                circleBlue, circleGreen, circleRed,
                triangleGreen, triangleYellow
        };

        printArea(figures);
        System.out.println();
        System.out.printf("Total area: %.2f", getTotalArea(figures));
        System.out.println();
        System.out.printf("\nCircle area: %.2f", getShapeArea(figures, circleBlue));
        System.out.printf("\nRectangle area: %.2f", getShapeArea(figures, rectangleBlue));
        System.out.printf("\nTriangle area: %.2f", getShapeArea(figures, triangleGreen));


    }

    public static void printArea(Shape[] array) {
        for (Shape figure : array) {
            System.out.printf(figure.getClass().getSimpleName() + " "
                    + figure.getColor() + ": area --- %.2f" + "\n", figure.calcArea());
        }
    }

    public static double getTotalArea(Shape[] array) {
        double total = 0;
        for (Shape figure : array) {
            total += figure.calcArea();
        }
        return total;
    }


    public static double getShapeArea(Shape[] array, Shape object) {
        double total = 0;
        for (Shape figure : array) {
            if (figure.getClass().equals(object.getClass())) {
                total += figure.calcArea();
            }
            //  **

        }
//  **        String stringClass = object.getClass().getSimpleName();
//            if (stringClass.equals(figure.getClass().getSimpleName())) {
//                total += figure.CalcArea();
//            }
        return total;

    }
}

