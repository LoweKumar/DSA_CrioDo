package com.lowe.DSA102Feb2025;

import java.util.*;


class WiggleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    static List<Integer> wiggleSort(int n, List<Integer>nums){
        for(int idx=1; idx<nums.size(); idx+=2)
        {
            if(nums.get(idx-1)>nums.get(idx))
            {
                Collections.swap(nums, idx-1, idx);
            }
            if(idx!=nums.size()-1 && nums.get(idx+1)>nums.get(idx))
            {
                Collections.swap(nums, idx+1, idx);
            }
        }
        return nums;
    }
}