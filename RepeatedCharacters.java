package com.package3;

public class RepeatedCharacters {

    public static void main(String[] args) {
        String sentence = "Print repeatedly occuring characters";
        System.out.println(sentence);

        String characters ="";
        String repeated ="";

        for (int i = 0; i < sentence.length(); i++) {
            String current = Character.toString(sentence.charAt(i));
            if (characters.contains(current)) {
                if (!repeated.contains(current))
                    repeated += current + ",";
            }
            characters += current;
        }
        System.out.println(repeated);
    }
}
