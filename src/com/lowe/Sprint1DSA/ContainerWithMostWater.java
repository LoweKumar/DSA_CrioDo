package com.lowe.Sprint1DSA;

import java.io.*;
import java.util.*;

class ContainerWithMostWater {

    // Complete the function implementation below
    public int maxArea(int[] height) {
        int answer = 0;
        int left = 0, right = height.length-1;
        while(left<right)
        {
            int area = Math.min(height[left], height[right])*(right - left);
            answer = Math.max(answer, area);

            if(height[left] < height[right])
                left++;
            else right--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new ContainerWithMostWater().maxArea(height);
        System.out.println(result);
    }
}
