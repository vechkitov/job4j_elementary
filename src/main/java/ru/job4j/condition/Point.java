package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int xDistance = x2 - x1;
        int yDistance = y2 - y1;
        double xPow = Math.pow(xDistance, 2);
        double yPow = Math.pow(yDistance, 2);
        double rsl = Math.sqrt(xPow + yPow);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);

        result = Point.distance(-1, 1, 2, -2);
        System.out.println("result (-1, 1) to (2, -2) is " + result);

        result = Point.distance(10, 3, -4, -6);
        System.out.println("result (10, 3) to (-4, -6) is " + result);
    }
}
