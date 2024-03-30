package itmoTasks.Task2_2;

public class AllFigures {
    static class Circle extends Shape {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle extends Shape {
        private double length;
        private double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double calculateArea() {
            return length * width;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    static class Triangle extends Shape {
        private double side1;
        private double side2;
        private double side3;

        Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        @Override
        double calculateArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    }
}
