package com.lowe.DSA102Feb2025;

import java.util.*;

class TwoSumInSortedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {
        int left = 0 , right = n-1;
        while(left<right)
        {
            int sum = arr[left] + arr[right];
            if (sum==k){
                return true;
            }
            else if(sum<k){
                left++;
            }
            else if(sum>k){
                right--;
            }
        }
        return false;
    }
}