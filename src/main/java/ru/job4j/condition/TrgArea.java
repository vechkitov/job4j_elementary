package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double semiPer = (a + b + c) / 2;
        double base = semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c);
        double rsl = Math.sqrt(base);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
