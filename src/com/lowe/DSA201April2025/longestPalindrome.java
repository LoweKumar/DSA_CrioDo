package com.lowe.DSA201April2025;

import java.util.*;

class LongestPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int res = longestPalindrome(n, s);

        System.out.println(res);
    }
    static int longestPalindrome(int n, String s) {
     HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for (int freq : freqMap.values()) {
            if (freq % 2 == 0) {
                length += freq; 
            } else {
                length += freq - 1; 
                oddFound = true;    
            }
        }

       
        if (oddFound) {
            length += 1;
        }

        return length;
    }
}

/* 
Problem Description
You are given a string consisting of lower and upper case characters.
You need to find the length of the longest palindrome which you can create by using the characters from the string.
Note: Upper case and lower case characters are different from each other i.e, "Aa" is not a palindrome as 'A' != 'a'.

Input format
There are 2 lines of input

First line contains the size of the string

Second line contains the string.

Output format
Print the length of the longest palindrome possible.

Sample Input 1
4 bbde

Sample Output 1
3

Explanation
The possible 3 size palindrome strings are :- beb and bdb

Constraints
1 <= Size of String <= 10^4
*/
