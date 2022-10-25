package com.package3;

import java.util.Scanner;

public class vowels_and_consonants {

    public static void main(String[] args) {
        char ch;
        int vowels = 0;
        int consonants =0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string => ");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if ( ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Total number of vowels => "+vowels);
        System.out.println("Total number of consonants => "+consonants);
        scanner.close();
    }
}
