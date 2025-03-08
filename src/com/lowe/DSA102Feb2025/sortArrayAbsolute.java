package com.lowe.DSA102Feb2025;

import java.util.*;

class SortArrayAbsolute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res[] = sortArrayAbsolute(n, arr);

        for (int j : res)
            System.out.print(j + " ");
    }

    static int[] sortArrayAbsolute(int n, int arr[]) 
    {
        Integer[] nums = new Integer[n];
        for(int idx = 0; idx<n ; idx++)
        {
            nums[idx]=arr[idx];
        }
        Arrays.sort(nums, (a,b)->
            {
                if(Math.abs(a)<Math.abs(b)) return -1;
                else if(Math.abs(a)>Math.abs(b)) return 1;
                else return 0;
            }
        );

        for(int idx = 0; idx<n; idx++)
        {
            arr[idx] =nums[idx];
        }
        return arr;
    }
}
