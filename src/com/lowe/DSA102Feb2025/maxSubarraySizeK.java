package com.lowe.DSA102Feb2025;

import java.util.*;

class MaximumSubarraySumSizeK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSubarraySumSizeK(arr, n, k));
        sc.close();
    }

    static int maximumSubarraySumSizeK(int[] arr, int n, int k) 
    {
        int sum=0;
        for(int idx=0; idx<k; idx++)
        {
            sum+=arr[idx];
        }
        int max=sum;
        for(int idx=k; idx<n; idx++)
        {
            sum+=arr[idx];
            sum-=arr[idx-k];
            if(sum>max)max = sum;
        }
        return max;
    }
}
