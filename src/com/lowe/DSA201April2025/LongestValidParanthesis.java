package com.lowe.DSA201April2025;
import java.util.*;


class LongestValidParentheses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = longestValidParentheses(S);
        System.out.println(ans);
    }

    static int longestValidParentheses(String str)
    {
         Stack<Integer> stack = new Stack<>();
        stack.push(-1); 
        int maxLen = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else { 
                stack.pop();
                if (!stack.isEmpty()) {
                    int length = i - stack.peek();
                    maxLen = Math.max(maxLen, length);
                } else {
                    stack.push(i); 
                }
            }
        }

        return maxLen;
    }
}

/* 
Problem Description
Given a string S containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Input format
First line contains a string - The string S.

Output format
Print the length of the longest valid substring.

Sample Input 1
()(()(())

Sample Output 1
6

Explanation
The last 6 characters of the string forms the longest valid substring i.e. "()(())".

Constraints
0 <= length of string <= 10^5
*/
