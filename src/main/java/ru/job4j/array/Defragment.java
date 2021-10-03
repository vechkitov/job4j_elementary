package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        int notNullIndex = 1;
        for (int index = 0; index < array.length && notNullIndex < array.length; index++) {
            if (array[index] == null) {
                for (; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        SwitchArray.swap(array, notNullIndex, index);
                        break;
                    }
                }
            }
            notNullIndex++;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
