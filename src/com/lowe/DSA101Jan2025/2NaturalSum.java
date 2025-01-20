package com.lowe.DSA101Jan2025;

import java.util.*;


class NaturalSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = naturalSum(n);
        System.out.println(res);
    }

    static int naturalSum(int n){
        int result = (n*(n+1))/2;
        return result;
    }
}
