package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 7, 1, 3, 9, 6};
        System.out.println("Initial array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        Arrays.sort(arr);
    }

}
