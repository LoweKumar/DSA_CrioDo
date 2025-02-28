package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j= 0; j<nums.length; j++)
        {
            int  x = target - nums[j];

            if(map.containsKey(x)==true)
            {
                int i = map.get(x);
                return new int[]{i, j};
            }

            map.put(nums[j], j);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.close();

        int[] complements = new TwoSum().twoSum(numbers, target);
        System.out.print(complements[0] + " " + complements[1]);
    }
}
