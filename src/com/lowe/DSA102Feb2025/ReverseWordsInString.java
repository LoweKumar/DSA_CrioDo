package com.lowe.DSA102Feb2025;

import java.util.*;


class ReverseWordsInAString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWordsInAString(s));
        sc.close();
    }

    static String reverseWordsInAString(String s){
        s= s.trim();
        String[] words = s.split("\\s+");
        String ans = "";
        for(int i=words.length-1; i>=0; i--){
            ans+=words[i]+" ";
        }
        return ans;
    }
}
