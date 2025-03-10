package com.lowe.DSA102Feb2025;

import java.util.*;

class CountOccurrences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int res = countOccurrences(n, k, a);

        System.out.println(res);
    }

    static int firstIndex(int[] a, int k)
    {
        int left=0, right=a.length-1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(a[mid]==k)
            {
                right = mid-1;
            }
            else if(a[mid]<k)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return left;
    }

    static int lastIndex(int[]a, int k)
    {
        int left =0, right =a.length-1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(a[mid]==k)
            {
                left = mid+1;
            }
            else if(a[mid]<k)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return right;
    }

    static int countOccurrences(int n, int k, int a[]) 
    {
        int first = firstIndex(a, k);
        int last = lastIndex(a, k);
        if(first>last) return 0;
        return last-first+1;
    }

}
