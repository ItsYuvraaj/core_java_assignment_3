package com.package3;

public class Main {

    public static void main(String[] args) {
        String str = "iNeuron";
        String str1 = "";
//        char ch;
        System.out.println("The Original String is    : "+str);

//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i);
//            str1 = ch + str1;
//        }

        for (int i = str.length()-1; i >=0 ; i--) {
            str1 = str1 + (char) (str.charAt(i));
        }
        System.out.println("String after reversing is : "+str1);
    }
}
