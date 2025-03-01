package com.lowe.DSA102Feb2025;

import java.util.*;

class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long arr[]) {
        long lsum=0, rsum = 0;
        for(long e:arr)
        {
            rsum += e;
        }
        for(int i=0; i<arr.length; i++)
        {
            rsum-=arr[i];
            if(lsum == rsum)
            {
                return i;
            }
            lsum += arr[i];
        }
        return -1;
    }
}