package com.lowe.DSA102Feb2025;

import java.util.*;

class MinDiff {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = minDiff(n, a);

        System.out.println(res);

    }

    static int minDiff(int n, int arr[]) 
    {
        Arrays.sort(arr);
        int ans = 1000000001;
        for(int i=0; i<= n-2; i++)
        {
            if(arr[i+1]-arr[i]<ans)
            {
                ans = arr[i+1]-arr[i];
            }
        }
        return ans;
    }
}