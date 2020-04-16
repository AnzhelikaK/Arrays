package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] testArray = {4, 8, 15, 16, 23, 42};
        String testString = "Anzhelika";
        int[] disorderedArray = {1, 0, 7, 9, 5, 1, 4, 2, 2, 7, 6, 0, 2, 1, -5, -8, -97};
        String stringPhrase = "  Anzhelika Kryvapust     Shcharbitskaya         ";

        // 1.1
        System.out.println("\n1.1 Reverse the array of numbers vise-versa");
        System.out.println(Arrays.toString(Reverse.reverseArray(testArray)));

        // 1.2
        System.out.println("\n1.2 Reverse the array of numbers vise-versa: the way 2 - reverse without an additional array");
        System.out.println(Arrays.toString(Reverse.reverseArray2(testArray)));

        // 2.1
        System.out.println("\n2.1 Flip the line-String vice-versa");
        System.out.println(Reverse.reverseString(testString));

        // 2.2
        System.out.println("\n2.2 Flip the line vice-versa without StringBuilder");
        System.out.println(Reverse.reversString2(testString));

        // 3.1
        System.out.println("\n3.1 Sort the array of numbers without Arrays.sort(array). Selection sort (RU: Сортировка выбором)");
        System.out.println(Arrays.toString(Reverse.selectionSort(disorderedArray)));

        // 3.2
        System.out.println("\n3.2 Sort the array of numbers without Arrays.sort(array). Bubble sort (RU: Сортировка Пузырьком)");
        System.out.println(Arrays.toString(Reverse.bubbleSort(disorderedArray)));

        // 4.
//        We don't pay attention to " " at the end of the phrase
        System.out.println("\n4. Reverse each word in the line save the order of words");
        System.out.println(Reverse.reversePhrase(stringPhrase));
    }
}
