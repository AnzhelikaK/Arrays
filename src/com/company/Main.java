package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1.1
        System.out.println("\n1.1 Reverse the array of numbers vise-versa\n");
        System.out.println(Arrays.toString(Reverse.reverse(new int[]{11, 13, 14, 15, 16, 17, 18, 19, 20})));
        int[] b = null;
        System.out.println(Arrays.toString(Reverse.reverse(b)));

        // 1.2
        System.out.println("\n1.2 Reverse the array of numbers vise-versa: the way 2 - reverse without an additional array\n");
        System.out.println(Arrays.toString(Reverse.reverse2(new int[]{11, 13, 14, 15, 16, 17, 18, 19, 20})));
        System.out.println(Arrays.toString(Reverse.reverse2(b)));

        // 2.1
        System.out.println("\n2.1 Flip the line-String vice-versa\n");
        String c = Reverse.reverseString("Anzhelika");
        System.out.println("Result: " + c + "\n");

        // 2.2
        System.out.println("\n2.2 Flip the line vice-versa without StringBuilder");
        System.out.println(Reverse.reversString2("Anzhelika"));

        // 3.1
        System.out.println("\n3.1 Sort the array of numbers without Arrays.sort(array). Selection sort (RU: Сортировка выбором)\n");
        System.out.println(Arrays.toString(Reverse.sort(new int[]{1, 0, 7, 9, 5, 1, 4, 2, 2, 7, 6, 0, 2, 1, -5, -8, -97})));

        // 3.2
        System.out.println("\n3.2 Sort the array of numbers without Arrays.sort(array). Bubble sort (RU: Сортировка Пузырьком)\n");
        System.out.println(Arrays.toString(Reverse.sort2(new int[]{1, 0, 7, 9, 5, 1, 4, 2, 2, 7, 6, 0, 2, 1, -5, -8, -97})));

        // 4.
        System.out.println("\n4. Reverse each word in the line save the order of words\n");
        System.out.println(Reverse.reverse(" Anzhelika Kryvapust     Shcharbitskaya "));
            }
}
