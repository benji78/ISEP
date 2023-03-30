package com.benji.TP3;

public class Ascii {
    public static void drawCat(int height, int width) {
        // ears and top of the head
        System.out.println("|\\" + "-".repeat(width + 3) + "/|");

        // middle of the head and eye
        for (int i = 1; i < height + 1; i++) {
            System.out.print("|");
            if (i == height / 2 + 1) {
                System.out.print(" 0" + "_".repeat(width + 1) + "0 ");
            } else {
                printCharLoop(width + 5, ' ');
            }
            System.out.println("|");
        }

        // bottom of the head
        System.out.print(" \\_");
        printCharLoop(width + 1, '^');
        System.out.println("_/ ");
    }

    private static void printCharLoop(int n, char c) {

        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
