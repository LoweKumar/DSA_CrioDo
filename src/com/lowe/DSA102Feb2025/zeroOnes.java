package com.lowe.DSA102Feb2025;

import java.util.*;

class ZeroOnes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = zeroOnes(n, a);
        System.out.println(res);

    }

    static int zeroOnes(int n, int a[]) 
    {
        int answer = -1;
        int left = 0, right = n-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(a[mid]==0)
            {
                left = mid+1;
            }
            else
            {
                right = mid -1;
                answer = mid;
            }
        }
        return answer;
    }
}
