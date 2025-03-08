package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;
class SearchInRotatedSortedArray {

    // Complete the function implementation below
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If the middle element is the target, return its index
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) {  // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) { // Target is in the left half
                    right = mid - 1;
                } else {  // Target is in the right half
                    left = mid + 1;
                }
            } else {  // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) { // Target is in the right half
                    left = mid + 1;
                } else {  // Target is in the left half
                    right = mid - 1;
                }
            }
        }
        
        return -1; // Target not found
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while(q > 0) {
            int target = scanner.nextInt();
            int result = new SearchInRotatedSortedArray().search(nums , target);
            System.out.println(result);
            q--;
        }
    }
}
