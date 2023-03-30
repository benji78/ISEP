package com.benji.harryPoterProject.view;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputParser {
    private final Scanner scanner;

    public InputParser(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public int getInt() {
        int input = 0;
        boolean isInt = false;
        do {
            try {
                input = scanner.nextInt();
                isInt = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                scanner.nextLine();
            }
        } while (!isInt);
        return input;
    }


}
