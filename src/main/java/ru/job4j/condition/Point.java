package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double distance = Point.distance(0, 0, 2, 0);
        System.out.println("distance from (0, 0) to (2, 0) is " + distance);

        distance = Point.distance(-1, 1, 2, -2);
        System.out.println("distance from (-1, 1) to (2, -2) is " + distance);

        distance = Point.distance(10, 3, -4, -6);
        System.out.println("distance from (10, 3) to (-4, -6) is " + distance);
    }
}
