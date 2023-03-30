package com.benji.harryPoterProject.controller;

import com.benji.harryPoterProject.view.InputParser;

public class Game {
    private boolean isGameFinished = false;

    public void start() {
        InputParser inputParser = new InputParser(System.in);
        do {
            System.out.println("Welcome to the game!");
            System.out.print("Please enter your name: ");
            String playerName = inputParser.getString();
            System.out.println("Hello " + playerName + "!");
            isGameFinished = true;
        } while (!isGameFinished);
    }
}
