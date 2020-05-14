package com.company;

import javax.crypto.NullCipher;
import java.util.ArrayList;

public class Reverse {
    // 1.1 Reverse the array of numbers vise-versa
    public static int[] reverse(int[] array) {
        if (array == null) {                                        // All time CHECK on null
            System.out.println("Received empty array");
            return null;                                             // first option
            // return throw new NullPointerException("You sent null");  // second option
            // return new int []{};                                     // third option
        } else {
            int[] arrayTemporary = new int[array.length];
            for (int i = 0; i < array.length; i++) arrayTemporary[i] = array[array.length - i - 1];
            return arrayTemporary;
        }
    }

    // 1.2 Reverse the array of numbers vise-versa: the way 2 - reverse without an additional array
    public static int[] reverse2(int[] array) {
        if (array != null) {
            int x = 0;
            for (int i = 0; i < array.length / 2; i++) {
                x = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = x;
            }
            return array;
        } else return new int[]{};      //  pay attention (how write else + return - IN ONE LINE

    }

    // 2.1 flip the line-String vice-versa
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
    public static String reversString2(String str) {
        if (str != null) {
        int l = str.length();
        char[] arrayOfStr = new char[l];

            for (int i = l - 1; i >= 0; i--) {
                arrayOfStr[l - i - 1] = str.charAt(i);
            }

        return String.valueOf(arrayOfStr);
        // return new String(arrayOfStr);
        } else return null;
    }

    // 3.1 Sort the array of numbers without Arrays.sort(array). Selection sort (RU: Сортировка выбором)
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int iMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    iMin = j;
                }
            }
            if (array[i] != min) {  // or compare with use INDEX:  i!=iMin
                array[iMin] = array[i];
                array[i] = min;
            }
        }
        return array;
    }

    // 3.2 Sort the array of numbers without Arrays.sort(array). Bubble sort (RU: Сортировка Пузырьком)
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

    // 4. Reverse each word in the line save the order of words
    public static String reverse(String phrase) {
        String delimitr = " ";
        String[] arrayOfPhrase;
        StringBuilder phraseBuilt = new StringBuilder();
        arrayOfPhrase = phrase.split(delimitr);
        for (int i = 0; i < arrayOfPhrase.length; i++) {
            if (!arrayOfPhrase[i].equals(delimitr)) {
                StringBuilder temp = new StringBuilder(arrayOfPhrase[i]);
                phraseBuilt.append(temp.reverse().toString()).append(" ");
            }
        }
        //  return phraseBuilt.toString().trim(); // to cut " " at the end, but then cut also " "  at the beginning
        // or
        String a = phraseBuilt.toString();
        return a.substring(0, a.length() - 1);
    }
}

