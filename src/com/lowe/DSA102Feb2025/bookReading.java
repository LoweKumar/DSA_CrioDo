package com.lowe.DSA102Feb2025;

import java.util.*;


class BookReading{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int result = bookReading(n,h,a);
        System.out.println(result);
    }
    static boolean isPossible(int[] a, int h, long mid)
    {
        long totaltime = 0;
        for(int books:a)
        {
            double time = Math.ceil(1.0*books/mid);
            totaltime+=(long)time;
        }
        if(totaltime<=h) return true;
        else return false;
    }

    static int bookReading(int n,int h,int a[])
    {
        long left = 1, right = (long)1e9;
        long answer = right;
        while(left<=right)
        {
            long mid = (left + right)/2;
            if(isPossible(a, h, mid))
            {
                answer = mid;
                right = mid-1;
            }
            else
            left = mid +1;
        }
        return (int)answer;
    }
}