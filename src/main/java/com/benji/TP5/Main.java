package com.benji.TP5;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = initialiserTableau(Integer.MAX_VALUE / 500);
        runSortAlgorithm(array, "quickSort");
        runSortAlgorithm(array, "quicksort");
        runSortAlgorithm(array, "insertionSort");
        runSortAlgorithm(array, "bubbleSort");
    }

    public static void runSortAlgorithm(int[] array, String algorithm) {
        Instant start = Instant.now();
        switch (algorithm) {
            case "quickSort" -> quickSort(array, 0, array.length - 1);
            case "quicksort" -> quicksort(array, 0, array.length - 1);
            case "insertionSort" -> insertionSort(array, 0, array.length - 1);
            case "bubbleSort" -> bubleSort(array);
            default -> {
                System.out.println("Invalid algorithm name");
                return;
            }
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("Sorting algorithm: " + algorithm);
        System.out.println("Execution time: " + duration + " ms");
    }

    private static void insertionSort(int[] array, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= start && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static int[] initialiserTableau(int size) {
        int[] tableau = new int[size];
        Instant start = Instant.now();
        System.out.println("Initialisation...");
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(size);
        }
        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("L’initialisation a pris " + duration + " ms");
        return tableau;
    }

    public static void bubleSort(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static void quickSort(int[] array, int indGauche, int indDroit) {
        int pivot = array[indGauche + (indDroit - indGauche) / 2];
        int i = indGauche;
        int j = indDroit;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (indGauche < j) {
            quickSort(array, indGauche, j);
        }
        if (i < indDroit) {
            quickSort(array, i, indDroit);
        }
    }

    public static void quicksort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quicksort(arr, begin, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }
}
