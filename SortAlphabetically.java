package com.package3;

public class SortAlphabetically {

    public static void main(String[] args) {
        String s = "sorting a string alphabetically";
        System.out.println("Original String Before sorting : "+s);
        char arr[] = s.toCharArray();
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;

            }
            i += 1;

        }
        System.out.print("After sorting                  :");
        System.out.println(arr);

    }
}
