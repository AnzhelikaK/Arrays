package com.company;

import javax.crypto.NullCipher;
import java.util.ArrayList;

public class Reverse {
    // 1.1 перевернуть массив чисел в обратном порядке
    public static int[] reverse(int[] array) {
        if (array == null) {
            System.out.println("Received empty array");
            return null;
        } else {
            int[] arrayTemporary = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayTemporary[i] = array.length - i;
            }
            return arrayTemporary;
        }
    }

    // 1.2 перевернуть массив чисел в обратном порядке: способ 2 - переворачивание без дополниетлнього массива
    public static int[] reverse2(int[] array) {
        if (array != null) {
            int x = 0;
            for (int i = 0; i < array.length / 2; i++) {
                x = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = x;
            }
            return array;
        } else return new int[]{0};      //  pay attention

    }


    // 2.1 flip the line vice-versa
    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (str != null) {
            char[] charArray = str.toCharArray();
            for (int i = charArray.length - 1; i >= 0; i--) {
                stringBuilder.append(charArray[i]);
            }
        }
            return stringBuilder.toString();
    }

    // 2.2 flip the line vice-versa without StringBuilder
    public static String reversString2(String str){
        int l=str.length();
        char [] arrayOfStr=new char[l];
        for (int i = 0; i <l ; i++) {
            arrayOfStr[i]=str.charAt(l-i-1);
        }
        return new String(arrayOfStr);
    }

    // 3.1 сортировка массива чисел без использования Arrays.sort(); Сортировка выбором
    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            int min = array[i];
            int i_min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    i_min = j;
                }
            }
            if (array[i] != min) {  // можно также по индеку сравнивать i!=i_min
                array[i_min] = array[i];
                array[i] = min;
            }
        }
        return array;
    }

    // 3.2 сортировка массива чисел без использования Arrays.sort(); Сортировка Пузырьком
    public static int[] sort2(int[] array) {
        int temp = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    // 4 перевенуть каждое слово в строке сохраняя порядок слов
    public static String reverse(String phrase) {
        String delimitr = " ";
        String[] arrayOfphrase;
        StringBuilder phraseBuilt = new StringBuilder();
        arrayOfphrase = phrase.split(delimitr);
        for (int i = 0; i < arrayOfphrase.length; i++) {
            if (arrayOfphrase[i].equals(delimitr)) {
            } else {
                StringBuilder temp = new StringBuilder(arrayOfphrase[i]);
                phraseBuilt.append(temp.reverse().toString() + " ");

            }
        }
        return phraseBuilt.toString();
    }
}

