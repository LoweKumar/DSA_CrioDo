package com.lowe.DSA101Jan2025;

import java.util.*;


class LeapYearBasic{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean res = leapYear(N);
        System.out.println(res);
    }

    static boolean leapYear(int N){
        if((N%4 == 0 && N%100 != 0) || (N%400 == 0)){
            return true;
        }
        return false;
    }
}
