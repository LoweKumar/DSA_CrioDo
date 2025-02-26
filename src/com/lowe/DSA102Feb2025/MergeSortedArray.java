package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

public class MergeSortedArray {
    // Implement your solution by completing the below function
    public static int [] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int p1=0, p2=0, i=0;
        int[] ans = new int[m+n];
        while(p1<m && p2<n){
            if(nums1[p1]<=nums2[p2])
            {
                ans[i++]=nums1[p1++];
            }
            else
            {
                ans[i++]=nums2[p2++];
            }
        }
        while(p1<m)
        {
            ans[i++]=nums1[p1++];
        }
        while(p2<n)
        {
            ans[i++]=nums2[p2++];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++)
            nums1[i] = scanner.nextInt();
        for (int i = 0; i < n; i++)
            nums2[i] = scanner.nextInt();

        scanner.close();

        int[] nums = mergeSortedArray(nums1, m, nums2, n);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
}