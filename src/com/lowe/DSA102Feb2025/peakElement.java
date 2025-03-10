package com.lowe.DSA102Feb2025;

import java.util.*;


class PeakElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(peakElement(arr));
    }

    static int peakElement(int arr[])
    {
        int n = arr.length;
        int left =0, right =n-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            int lval = (mid==0)?Integer.MIN_VALUE:arr[mid-1];
            int rval = (mid==n-1)?Integer.MIN_VALUE:arr[mid+1];
            if(arr[mid]>lval && arr[mid]>rval)
            {
                return mid;
            }
            else if(arr[mid]<lval)
            {
                right = mid-1;
            }
            else
            left = mid+1;
        }
        return 0;
    }
}
