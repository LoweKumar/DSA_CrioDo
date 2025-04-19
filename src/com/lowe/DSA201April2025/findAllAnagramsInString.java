package com.lowe.DSA201April2025;

import java.util.*;

class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pFreq = new int[26]; 
        int[] sFreq = new int[26]; 

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                sFreq[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    String[] input = new String[2]; 
	    input = scanner.nextLine().split(" ");
        String s = input[0];
        String p = input[1];
        scanner.close();

        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s,p);
	    System.out.println(result.size());
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
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
