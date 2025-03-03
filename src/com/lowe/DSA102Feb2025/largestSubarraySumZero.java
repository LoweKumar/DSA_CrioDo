package com.lowe.DSA102Feb2025;

import java.util.*;

class LargestSubarraySumZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = largestSubarraySumZero(n, arr);

        for (int j : res)
            System.out.print(j + " ");

    }

    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) 
    {
        int maxLength=0, start = -1, sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum, -1);
        for(int i=0; i<n; i++)
        {
            sum+=arr[i];
            if(map.containsKey(sum))
            {
                int s = map.get(sum)+1;
                int length = i-s+1;
                if(length > maxLength)
                {
                    maxLength = length;
                    start = s;
                }
            }
            else
                {
                    map.put(sum, i);
                }
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=start; i<start+maxLength; i++)
        {
            ans.add(arr[i]);
        }
        return ans;
    }
}
