package com.company;

public class Reverse {
    // 1.1 Reverse the array of numbers vise-versa
    public static int[] reverseArray(int[] array) {
        if (array == null) {                                        // All time CHECK on null
            System.out.println("Received empty array");
            return new int[]{};                                             // first option
            // return throw new NullPointerException("You sent null");  // second option
            // return null;                                     // third option
        } else {
            int[] arrayTemporary = new int[array.length];
            for (int i = 0; i < array.length; i++) arrayTemporary[i] = array[array.length - i - 1];
            return arrayTemporary;
        }
    }

    // 1.2 Reverse the array of numbers vise-versa: the way 2 - reverse without an additional array
    public static int[] reverseArray2(int[] array) {
        if (array != null) {
            int x;
            for (int i = 0; i < array.length / 2; i++) {
                x = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = x;
            }
            return array;
        } else {
            System.out.println("Received empty array");
            return new int[]{};
        }
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
    public static int[] selectionSort(int[] array) {
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
    public static int[] bubbleSort(int[] array) {
        int temp;
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
    public static String reversePhrase(String phrase) {
        String delimiter = " ";
        String[] arrayOfPhrase;
        StringBuilder phraseBuilt = new StringBuilder();
        arrayOfPhrase = phrase.split(delimiter);
        for (String s : arrayOfPhrase) {
            StringBuilder temp = new StringBuilder(s);
            phraseBuilt.append(temp.reverse().toString()).append(delimiter);
        }
        //  return phraseBuilt.toString().trim(); // to cut " " at the end, but then cut also " "  at the beginning
        // or
        return phraseBuilt.deleteCharAt(phraseBuilt.length() - 1).toString();
    }
}

