package com.package3;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "Heart";
        String s2 = "EARTH";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        if (c1.length != c2.length){
             System.out.println("Not Anagram");
             System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("Not Anagram");
                System.exit(0);
            }
        }
        System.out.println("Anagram");
    }
}
