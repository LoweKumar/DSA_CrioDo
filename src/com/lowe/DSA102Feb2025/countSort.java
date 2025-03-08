package com.lowe.DSA102Feb2025;

import java.util.*;

class CountSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String res = countSort(n, s);

        System.out.println(res);

    }

    static String countSort(int n, String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int idx = 0; idx<s.length(); idx++)
        {
            char ch = s.charAt(idx);
            int old = hm.getOrDefault(ch, 0);
            hm.put(ch, old+1);
        }
        StringBuilder res = new StringBuilder();
        for(char ch = 'a'; ch<='z';ch++)
        {
            int frequency = hm.getOrDefault(ch, 0);
            while(frequency-->0)res.append(ch);
        }

        return res.toString();
    }
}

