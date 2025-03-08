package com.lowe.DSA102Feb2025;

import java.util.*;

class NumSort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String sortedArray[] = numSort(n, arr);

        for (String num : sortedArray) {
            System.out.print(num + " ");
        }

    }

    static String[] numSort(int n, String[] arr) 
    {
        Arrays.sort(arr, 
            (a,b)->{
                if(a.length()<b.length()) return -1;
                else if(a.length()>b.length()) return +1;
                else return a.compareTo(b);
            }
        );
        return arr;
    }
}
