package com.lowe.DSA102Feb2025;
import java.util.*;

class RemoveDuplicatesFromSortedArrayII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = removeDuplicatesFromSortedArrayII(n, arr);

        System.out.println(res);

        for (int i = 0; i < res; i++)
            System.out.print(arr[i] + " ");

    }

    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) {

        int val =0, count =0, j=0;
        for(int i=0; i<n;){
            val = arr[i];
            count = 0;
            while(i<n && arr[i]==val)
            {
                count++;
                i++;
            }
            if (count>2)
            {
                count = 2;
            }
            while(count-- >0)
            {
                arr[j]=val;
                j++;
            }
        }
        return j;
    }

}
