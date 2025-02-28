package com.lowe.DSA102Feb2025;

import java.util.*;

class MaxSumTriplet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            long result = maxSumTriplet(n, arr);

            System.out.println(result);

        }

    }

    static long getithindex(long arr[], int j){
        long answer = 0;
        for(int i=0; i<j; i++){
            if(arr[i]<arr[j]){
                answer = Math.max(answer, arr[i]);
            }
        }
        return answer;
    }
    static long getkthindex(long arr[], int j){
        long answer = 0;
        for(int k=j+1; k<arr.length; k++){
            if(arr[k]>arr[j]){
                answer = Math.max(answer, arr[k]);
            }
        }
        return answer;
    }

    static long maxSumTriplet(int n, long arr[]) {
        long maxsum= 0;
        for(int j=0; j<arr.length; j++){
            long ithval = getithindex(arr, j);
            long kthval = getkthindex(arr, j);

            if(ithval + arr[j] + kthval >maxsum && ithval>0 && kthval>0){
                maxsum = Math.max(maxsum, ithval+arr[j]+kthval);
            }
        }
        return maxsum;
    }
}
