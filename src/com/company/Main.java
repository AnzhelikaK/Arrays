package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("перевернуть массив чисел в обратном порядке");
        System.out.println(Arrays.toString(Reverse.reverse2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        int[] b = null;
        int[] a = Reverse.reverse(b);

        System.out.println("\n 2.1 перевернуть строку в обратном порядке");
        String c = Reverse.reverseString("Anzhelika");
        System.out.println("Result: " + c + "\n");

        System.out.println("\n 2.2 flip the line vice-versa without StringBuilder");
        System.out.println(Reverse.reversString2("Anzhelika"));

        System.out.println("сортировка массива чисел без использования Arrays.sort() - Cортировка Выбором");
        System.out.println(Arrays.toString(Reverse.sort(new int[]{1, 0, 7, 9, 5, 1, 4, 2, 2, 7, 6, 0, 2, 1, -5, -8, -97})));

        System.out.println("\n сортировка массива чисел без использования Arrays.sort() - Cортировка Пузырьком");
        System.out.println(Arrays.toString(Reverse.sort2(new int[]{1, 0, 7, 9, 5, 1, 4, 2, 2, 7, 6, 0, 2, 1, -5, -8, -97})));

        System.out.println("перевенуть каждое слово в строке сохраняя порядок слов");
        System.out.println(Reverse.reverse("Anzhelika Kryvapust     Shcharbitskaya"));
        String n = new String();
    }
}
