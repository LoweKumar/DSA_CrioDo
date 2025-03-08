package com.lowe.DSA102Feb2025;

import java.util.*;

class NextGreaterElementWithSameSetOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(nextGreaterElementWithSameSetOfDigits(n));
    }
    static void reverse(char[] digits, int left, int right)
    {
        while(left<=right)
        {
            char temp = digits[left];
            digits[left]=digits[right];
            digits[right]=temp;
            left++;
            right--;
        }
    }

    static int nextGreaterElementWithSameSetOfDigits(int n)
    {
        char[] digits = Integer.toString(n).toCharArray();
        int i = digits.length-2;
        while(i>=0)
        {
            if(digits[i]<digits[i+1])
            {break;}
            i--;

        }
        if(i<0)return -1;
        int j=digits.length-1;
        while(j>=0)
        {
            if(digits[j]>digits[i])
            break;
            j--;
        }
        
        char temp = digits[i];
        digits[i]=digits[j];
        digits[j]=temp;

        reverse(digits, i+1, digits.length-1);
        return Integer.parseInt(String.valueOf(digits));

    }
}

