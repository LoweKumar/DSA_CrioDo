package com.lowe.DSA102Feb2025;
import java.util.*;


class KthSmallestElementInMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<ArrayList<Integer>>Matrix = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer>row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            Matrix.add(row);
        }
        int ans = kthSmallestElementInMatrix(Matrix,k);
        System.out.print(ans);
    }
    
    static int findCountSmallerOrEqual(List<ArrayList<Integer>>Matrix, int mid, int n)
    {
        int row = 0, col = n-1;
        int count =0;
        while(row<n&&col>=0)
        {
            if(Matrix.get(row).get(col)<=mid)
            {
                count += (col+1);
                row++;
            }
            else col--;
        }
        return count;
    }

    static int kthSmallestElementInMatrix(List<ArrayList<Integer>>Matrix, int k)
    {
        int n = Matrix.size();
        int left = Matrix.get(0).get(0);
        int right = Matrix.get(n-1).get(n-1);
        int answer = right;
        while(left<=right)
        {
            int mid = (left + right)/2;
            int count = findCountSmallerOrEqual(Matrix, mid , n);
            if(count<k) left=mid+1;
            else {
                answer = mid;
                right = mid-1;
            } 
        }
        return answer;
    }
    
}
