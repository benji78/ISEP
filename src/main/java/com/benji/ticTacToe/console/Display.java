package com.benji.ticTacToe.console;

import com.benji.ticTacToe.core.Board;
import com.benji.ticTacToe.core.Symbol;

public class Display {
    public Display() {
    }

    public void printText(String text) {
        System.out.println(text);
    }

    public void printTextWithColor(String text, Color color) {
        System.out.println(color.color + text + Color.BACK.color);
    }

    public String textWithColor(String text, Color color) {
        return color.color + text + Color.BACK.color;
    }

    public String wrapText(String text, String wrapper) {
        return "%s\n%s\n%s\n".formatted(wrapper, text, wrapper);
    }

    public void printTextWithWrapper(String text, String wrapper) {
        printText(wrapper);
        printText(text);
        printText(wrapper);
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.printTextWithColor("Hello", Color.BLUE);
        display.printTextWithWrapper("Choose your players", "=".repeat(80));
    }

    public void printBoard(Board board) {
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            for (int j = 0; j < Board.BOARD_SIZE; j++) {
                int squareColor = board.getSquare(i, j);
                if (squareColor == 0) {
                    System.out.print("| ");
                } else {
                    System.out.printf("|%s", Symbol.getSymbol(squareColor).symbol);
                }
            }
            System.out.println("|");
        }
    }
}