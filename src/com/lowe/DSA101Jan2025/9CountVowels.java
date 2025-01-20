package com.lowe.DSA101Jan2025;

import java.util.*;

class CountVowels {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    // TODO: Implement this method
    static int countVowels(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'||ch=='u'){
            count++;}
        }
        return count;
    }
}
