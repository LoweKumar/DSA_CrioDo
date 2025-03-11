package com.lowe.DSA102Feb2025;

import java.util.*;


class ReverseBits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-->0){
            long n = sc.nextLong();
            long ans = reverseBits(n);
            System.out.println(ans);
        }
    }
    static boolean checkSetBit(long n, int bit)
    {
        long mask = (1l<<bit);
        if((n & mask)==0) return false;
        else return true;
    }
    static long setBit(long n, int bit)
    {
        long mask = (1l<<bit);
        return (n | mask);
    }

    static long reverseBits(long n)
    {
        int right = 0, left = 31;
        long answer = 0;
        while(left>right)
        {
            if(checkSetBit(n, left)==true)
                answer = setBit(answer, right);
            if(checkSetBit(n, right)==true)
                answer = setBit(answer, left);
            
            left--; right++;
        }
        return answer;

    }
}    
}
