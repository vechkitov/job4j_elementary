package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int i = 0;
        int remainder = money - price;
        while (remainder > 0) {
            if (remainder >= coins[i]) {
                rsl[size] = coins[i];
                remainder -= coins[i];
                size++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
