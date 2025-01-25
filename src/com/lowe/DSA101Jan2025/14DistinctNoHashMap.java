package com.lowe.DSA101Jan2025;

import java.util.*;


class DistinctNumbersBasic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int nums[] = new int[n];
        for(int i=0;i<n;i++)
        nums[i] = sc.nextInt();

        int res = DistinctNumbers(n,nums);
        System.out.println(res);
    }

    static int DistinctNumbers(int n,int nums[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int val: nums){
            hs.add(val);
        }
        return hs.size();
    }
}
