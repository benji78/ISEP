package com.benji.TP2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle fonction voulez-vous exécuter ?\n1. Discriminant\n2. Parité\n3. Maximum\n4. Minimum\n5. string comp\n6. Factorielle\n7. Compte à rebours\n8. Carrés\n9. Tableau de multiplication\n10. Division\n11. Règle\n12. Nombre premier\n13. Tri tableau\n0. Quitter");
        boolean exit = false;
        do {
            System.out.println("Saisissez le numéro de la fonction à exécuter");
            switch (scanner.nextInt()) {
                case 1 -> discriminant();
                case 2 -> parity();
                case 3 -> max();
                case 4 -> min();
                case 5 -> equalStr();
                case 6 -> factorielle();
                case 7 -> countdown();
                case 8 -> carres();
                case 9 -> tableauMultiplication();
                case 10 -> division();
                case 11 -> ruler();
                case 12 -> nombrePremier();
                case 13 -> initialisationTableau();
                case 0 -> exit = true;
                default -> System.out.println("Erreur: fonction inconnue");
            }
        } while (!exit);
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynôme n’a pas de racine réelle");
        } else if (delta == 0) {
            System.out.println("Ce polynôme a une racine réelle double: " + (-b / (2 * a)));
        } else {
            System.out.println("Ce polynôme a deux racines réelles " + (-b + Math.sqrt(delta)) / (2 * a) + " et " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    public static void parity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez un entier");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " est pair");
        } else {
            System.out.println(a + " est impair");
        }
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez un entier");
        int a = scanner.nextInt();
        System.out.println("saisissez un deuxième entier");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " est le plus grand");
        } else {
            System.out.println(b + " est le plus grand");
        }
    }

    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez un entier");
        int a = scanner.nextInt();
        System.out.println("saisissez un deuxième entier");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println(a + " est le plus petit");
        } else {
            System.out.println(b + " est le plus petit");
        }
    }

    public static void equalStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("saisissez une chaîne de caractères");
        String a = scanner.nextLine();
        System.out.println("saisissez une deuxième chaîne de caractères");
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Les deux chaînes sont identiques");
        } else {
            System.out.println("Les deux chaînes sont différentes");
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Erreur: l'entier doit être positif ou nul");
            return;
        } else if (n == 0 || n == 1) {
            System.out.println("0! = 1");
            return;
        }
        int factorielle = 1;
        for (int i = 0; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown() {
        for (int seconds = 10; seconds >= 0; seconds--) {
            System.out.println(seconds);
        }
        System.out.println("BOOM!");
    }

    public static void carres() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "² = " + i * i); // Math.pow(i, 2)
        }
    }

    public static void tableauMultiplication() {
//        int[][] table = new int[10][10];
        for (int ligne = 0; ligne < 10; ligne++) {
            for (int colonne = 0; colonne < 10; colonne++) {
//                table[ligne][colonne] = (ligne + 1) * (colonne + 1);
                System.out.print((ligne + 1) * (colonne + 1) + (colonne == 9 ? ligne == 9 ? "" : "\n" : "\t"));
            }
        }
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un numérateur");
        int numerator = scanner.nextInt();
        int divider;
        do {
            System.out.println("Veuillez saisir un diviseur différent de 0");
            divider = scanner.nextInt();
        } while (divider == 0);
        System.out.println(numerator + "/" + divider + " = " + (numerator / divider));
    }

    public static void ruler() {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Veuillez saisir une longueur strictement positive");
            length = scanner.nextInt();
        } while (length <= 0);
        for (int i = 0; i < length; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
    }

    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Veuillez saisir une longueur strictement positive");
            n = scanner.nextInt();
        } while (n <= 0);
        boolean isPrime = true;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i < sqrt; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + (isPrime ? " est premier" : " n'est pas premier"));
    }

    public static void initialisationTableau() {
//        int[] tableau = new int[20];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < tableau.length; i++) {
//            System.out.println("Saisir un entier");
//            int entier = scanner.nextInt();
//            tableau[i] = entier;
//        }
//        taking 20 random numbers instead because i'm lazy
        int[] tableau = Arrays.stream(new int[20]).map(i -> (int) (Math.random() * 200 - 100)).toArray();
        System.out.println("Le tableau généré est : ");
        printArray(tableau);

//         .getAsInt() is safe because we know the array is not empty
        System.out.println("La plus petite valeur saisie est " + Arrays.stream(tableau).min().getAsInt());
        System.out.println("La plus grande valeur saisie est " + Arrays.stream(tableau).max().getAsInt());
        System.out.println("La somme des valeurs saisies est " + Arrays.stream(tableau).sum());
        System.out.println("Les elements paires sont :");
        Arrays.stream(tableau).filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("Les elements d'indice pair sont : ");
        for (int i = 0; i < tableau.length; i += 2) {
            System.out.print(tableau[i] + " ");
        }
//        same loop using IntStream
//        IntStream.range(0, tableau.length).filter(i -> i % 2 == 0).forEach(i -> System.out.print(tableau[i] + " "));
        System.out.println();
        System.out.println("Le tableau inversé est : ");
        printArray(inverseTableau(tableau));
        System.out.println();
    }

    public static int[] inverseTableau(int[] tableau) {
        return IntStream
                .rangeClosed(1, tableau.length)
                .mapToObj(i -> tableau[tableau.length - i])
                .mapToInt(i -> i)
                .toArray();
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}