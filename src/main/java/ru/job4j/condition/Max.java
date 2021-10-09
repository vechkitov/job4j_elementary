package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int one, int two, int three) {
        int result = max(max(one, two), three);
        return result;
    }

    public static int max(int one, int two, int three, int four) {
        int result = max(max(one, two), max(three, four));
        return result;
    }
}
