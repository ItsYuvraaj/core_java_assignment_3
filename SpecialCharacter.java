package com.package3;

public class SpecialCharacter {

    public static void main(String[] args) {
        String str = ";achiu3yr872yrAHJUHJNKNVJ654541*&^%^%$@#%$^^&09";
//        int lower = 0;
//        int upper = 0;
//        int number = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

//            if (c>='a'&&c<='z')
//                lower++;
//            else if (c>='A'&&c<='Z')
//                upper++;
//            else if (c>='0' && c<='9')
//                number++;
//            else
//                special++;
            if (!(c>='a'&&c<='z' || c>='A'&&c<='Z' || c>='0'&&c<='9'))
                special++;

        }
//        System.out.println("Total Number of lowercase characters => "+lower);
//        System.out.println("Total Number of uppercase characters => "+upper);
//        System.out.println("Total Number of numbers              => "+number);
        System.out.println("Total Number of special characters   => "+special);
    }
}
