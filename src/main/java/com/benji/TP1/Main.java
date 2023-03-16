package com.benji.TP1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        rectangle(8, 5);
        volume();
        division();
        somme();
        userInput();
    }

    public static void rectangle(int premierEntier, int deuxiemeEntier) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Veuillez saisir le premier entier");
//        int premierEntier = scanner.nextInt();
//        System.out.println("Veuillez saisir le deuxieme entier");
//        int deuxiemeEntier = scanner.nextInt();
        System.out.println("Voici un rectangle de " + premierEntier + " par " + deuxiemeEntier + " :");
        System.out.println("̲ ".repeat(premierEntier));
        for (int i = 0; i < deuxiemeEntier - 2; i++) {
            System.out.println("⎸" + " ".repeat(premierEntier - 2) + "⎹");
        }
        System.out.println("̅".repeat(premierEntier));
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le troisieme entier");
        int troisiemeEntier = scanner.nextInt();
        System.out.println("Le volume de " + premierEntier + " avec " + deuxiemeEntier + " et " + troisiemeEntier + " est égale à " + (premierEntier * deuxiemeEntier * troisiemeEntier));
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + (premierEntier / (float) deuxiemeEntier));
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est égale à " + (premierEntier + deuxiemeEntier));
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai récupéré un entier: " + unEntier);
        System.out.println("J’ai aussi récupéré un reel: " + unReel);


        // Enter username and press Enter
        System.out.println("Enter username");
        String userName = scanner.next();

        System.out.println("Username is: " + userName);
    }
}