package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        if (name.isBlank() || !isLowerLatinLetter(name.codePointAt(0))) {
            return false;
        }
        boolean res = true;
        for (int i = 1; i < name.length(); i++) {
            int code = name.codePointAt(i);
            res = isSpecialSymbol(code)
                    || isUpperLatinLetter(code)
                    || isLowerLatinLetter(code)
                    || Character.isDigit(code);
            if (!res) {
                break;
            }
        }
        return res;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
