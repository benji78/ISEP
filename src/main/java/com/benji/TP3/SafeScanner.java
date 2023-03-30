package com.benji.TP3;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeScanner {
    Scanner scanner;

    public SafeScanner(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    // while the input is not an int, catch and ask for an int
    public int getInt() {
        int input = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                input = this.scanner.nextInt();
                isInt = true;
            } catch (InputMismatchException e) {
                System.out.println("Veuillez saisir un entier");
                this.scanner.nextLine();
            }
        }
        return input;
    }

    public void close() {
        this.scanner.close();
    }
}