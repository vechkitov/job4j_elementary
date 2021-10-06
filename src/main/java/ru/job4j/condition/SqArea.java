package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = l * h;
        return result;
    }

    public static void main(String[] args) {
        double area = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, area = " + area);

        area = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, area = " + area);
    }
}
