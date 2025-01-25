package com.lowe.DSA101Jan2025;

import java.util.*;


class UniqueWords{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
        int res = uniqueWords(n,s);
        System.out.println(res);
    }

    static int uniqueWords(int n,String s[]){
        HashSet<String> set = new HashSet<>();
        for(String str:s){
            set.add(str);
        }
        return set.size();
    }
}

/*
 * Problem Description
You are given a list of words present in a book. Find out the count of unique words present in that book.

Input format
The first input line has an integer n where n is the number of words. Further n subsequent lines have word s[i].

Output format
Return the count of unique words in the list.

Sample Input 1
7 Java is great Grails is also great

Sample Output 1
5

Explanation
Unique words present in the list are : Java,is,great,Grails,also

Constraints
1 <= n <= 100 1 <= s[i] <= 15
 */