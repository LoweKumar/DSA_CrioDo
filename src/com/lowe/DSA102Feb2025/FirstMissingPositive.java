package com.lowe.DSA102Feb2025;

import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int e: nums){
            if(e>0){
                set.add(e);
            }
        }
        for(int i=1; i<n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}


/* 
Problem Description
Given an unsorted array of integers, find the smallest missing positive integer. The space complexity need not be O(1), you can also implement a O(N) space complexity solution.

Input format
There are 2 lines of input.

First line contains 1 integer N - Number of elements in the array.

Second line contains space separated N integers.

Output format
Print the smallest missing positive integer.

Sample Input 1
4

3 4 -1 1

Sample Output 1
2

Explanation 1
2 is the smallest positive integer which is missing as 1 is already present in the array. Note that 0 will not be considered as positive.

Constraints
N <= 200000

-2 ^ 31 <= Range of values <= 2 ^ 31 - 1
*/
