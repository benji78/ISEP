package com.benji.TP3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        SafeScanner safeScanner = new SafeScanner(Objects.requireNonNull(SafeScanner.class.getResourceAsStream("/main/resources/demo.txt")));
        System.out.println("What is your age?");
        int answer = safeScanner.getInt();
        System.out.printf("Your age is %d.%n", answer);
        safeScanner.close();
        Ascii.drawCat(0, 0);
        Ascii.drawCat(1, 0);
        Ascii.drawCat(2, 0);
        Ascii.drawCat(3, 0);
        Ascii.drawCat(4, 0);
        Ascii.drawCat(5, 0);
    }
}
