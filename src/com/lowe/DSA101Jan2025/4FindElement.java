package com.lowe.DSA101Jan2025;

import java.util.*;

class FindElement {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int x = sc.nextInt();

        int result = findElement(n, arr, x);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int findElement(int n, int[] arr, int x) {
        for(int i=0 ; i<n ; i++){
            if(x == arr[i]){
                return i;
            }
        
        }
        return -1;
    }
}
/*
 * Problem Description
Given an array of n elements and an integer x,find the index where x is present in the array. If there are multiple occurrences, find the leftmost one. If x is not present, return -1.

Input format
There are three lines of input.

First line contains integer n.

Second line contains n space separated integers representing the array.

Third line contains the value of x.

Output format
An integer representing the index of x in the array.

Sample Input 1
5

1 3 4 2 1

1

Sample Output 1
0

Explanation 1
1 is present at 0 and 4 indexes and the leftmost index is 0.

Constraints
1 <= n <= 100000

0 <= x <= 10^9
 */