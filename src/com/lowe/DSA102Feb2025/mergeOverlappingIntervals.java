package com.lowe.DSA102Feb2025;


import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ArrayList<int[]> result = new ArrayList<>();
        for(int[] curr:intervals)
        {
            int[] last = (result.size()==0 ?null:result.get(result.size()-1));
            if(last == null || last[1]<curr[0])
            {result.add(curr);}
            else 
            {last[1]=Math.max(last[1], curr[1]);}
        }
        int[][] ans = new int[result.size()][2];
        for(int idx=0; idx<ans.length; idx++)
        {
            ans[idx] = result.get(idx);
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}
