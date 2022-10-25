package com.package3;

public class Reverse {

    public static void main(String[] args) {
        String s1 = "Think Twice";
        String s2 = "";

        for (int i = s1.length()-1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        String s[]= s2.split(" ");
        String s4 = "";

        for (int i = s.length-1; i >=0; i--) {
            s4 = s4 + s[i] + " ";
        }
        System.out.println(s4);
    }
}
