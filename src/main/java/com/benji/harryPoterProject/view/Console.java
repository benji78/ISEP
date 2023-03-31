package com.benji.harryPoterProject.view;

import lombok.Getter;

public class Console {
    @Getter
    private static final InputParser inputParser = new InputParser(System.in);

    public static void print(String message) {
        System.out.println(message);
    }

    public int requestInt(String message, int min, int max) {
        System.out.print(message);
        return inputParser.getInt(min, max);
    }

    public static String requestString(String message) {
        System.out.println(message);
        return inputParser.getString();
    }

    public static void closeParser() {
        inputParser.close();
    }
}
