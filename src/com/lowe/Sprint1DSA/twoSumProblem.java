package com.lowe.criodoDSA;

import java.util.HashMap;
import java.util.Scanner;

public class twoSumProblem {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j= 0; j<nums.length; j++)
        {
            int  x = target - nums[j];

            if(map.containsKey(x)==true)
            {
                int i = map.get(x);
                System.out.println("i value "+i);
                return new int[]{i, j};
            }
            System.out.println("nums["+j+"]"+" value "+nums[j]);
            System.out.println("j value "+j);
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

        int[] complements = new twoSumProblem().twoSum(numbers, target);
        System.out.print(complements[0] + " " + complements[1]);
    }
}
