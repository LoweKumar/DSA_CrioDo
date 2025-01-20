package com.lowe.DSA101Jan2025;

import java.util.*;

class Capitalise {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitalise(String str) {
        char[] res = str.toCharArray();

        for(int i=0; i<str.length(); i++){
            if(res[i]=='.' || res[i]==' ')
            continue;
            if(i==0 || res[i-1]==' ')
            res[i] = Character.toUpperCase(res[i]);

        }
        return String.valueOf(res);
    }
}
/*
 * Problem Description
Given a paragraph of words, capitalise the first character of each word and return the updated paragraph.

Note : No inbuilt function such as split() to be used.

Input format
One line of input which contains a string, the paragraph.

Output format
Return the paragraph after capitalising each word.

Sample Input 1
the quick Brown fox jumps over The lazy dog.

Sample Output 1
The Quick Brown Fox Jumps Over The Lazy Dog.

Explanation 1
The first letter of each word has been capitalised and other permitted characters(dot ‘.’) have remained the same.

Sample Input 2
the quick Brown .... fox jumps over The lazy dog

Sample Output 2
The Quick Brown .... Fox Jumps Over The Lazy Dog.

Explanation 2
The first letter of each word has been capitalised and other permitted characters(dot ‘.’) have remained the same.

Constraints
Length of paragraph < 100

The paragraph contains spaces, lowercase, uppercase characters and ‘.’.

Resource
 */