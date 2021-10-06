package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double semiPer = (a + b + c) / 2;
        double base = semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c);
        double area = Math.sqrt(base);
        return area;
    }

    public static void main(String[] args) {
        double area = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + area);
    }
}
