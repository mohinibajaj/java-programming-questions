package org.example;

public class MaxVowelsInSubstringOfSizeK {

    public static void main(String[] args) {

        String s = "mohinibajaj";
        char[] arr = s.toCharArray();
        int k = 3;
        int vowels = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(arr[i])) {
                vowels++;
            }
        }

        int maxVowels = vowels;

        for (int i = k; i < arr.length; i++) {

            if (isVowel(arr[i - k])) {
                vowels--;

            }

            if (isVowel(arr[i])) {
                vowels++;
            }

            if (vowels > maxVowels) {
                maxVowels = vowels;
            }

        }

        System.out.println(maxVowels);

    }


    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}
