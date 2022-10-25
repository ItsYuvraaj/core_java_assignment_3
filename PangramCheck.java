package com.package3;

public class PangramCheck {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        boolean mark[] = new boolean[26];
        boolean pangram =true;
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch>='A' && ch<='Z')
                index = ch - 'A';
            else if (ch>='a' && ch<='z')
                index = ch - 'a';

            mark[index] = true;
        }
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == false)
                pangram = false;
        }
        if (pangram)
            System.out.println("It's a pangram");
        else
            System.out.println("It's not a pangram");

    }
}
