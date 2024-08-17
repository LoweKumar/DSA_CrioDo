package com.lowe.criodoDSA;

import java.util.Scanner;
import java.util.*;

class uniqueTriplet {

    public List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++)
        {
            if(i-1>=0 && nums[i]== nums[i-1])
                continue;

            int j = i+1 , k = nums.length-1;
            while(j<k)
            {
                if (j-1>i && nums[j]==nums[j-1])
                {
                    j++; continue;
                }

                int sum = nums[i]+nums[j]+nums[k];

                if(sum==0)
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    result.add(triplet);

                    j++;
                }
                else if(sum>0)
                    k--;
                else
                    j++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer nums[] = new Integer[n];
        for(Integer i = 0 ; i < n ;i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> result = new uniqueTriplet().threeSum(nums);
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d %d %d\n", result.get(i).get(0), result.get(i).get(1), result.get(i).get(2));
        }
    }
};
