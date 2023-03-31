package com.benji.harryPotterProject.view;

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

    public int getInt(int min, int max) {
        int input = 0;
        boolean isInt = false;
        do {
            try {
                input = scanner.nextInt();
                isInt = true;
            } catch (InputMismatchException e) {
                Console.print("Please enter an integer between " + min + " and " + max + " !");
                scanner.nextLine();
            }
        } while (!isInt || input < min || input > max);
        return input;
    }

    public void close() {
        this.scanner.close();
    }
}
