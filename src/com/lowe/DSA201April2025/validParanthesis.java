package com.lowe.DSA201April2025;

import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution here
    public String isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return "false";
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return "false";
                }
            }
        }

        return stack.isEmpty() ? "true" : "false";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }
}

/* 
/* 
Given a string S containing the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

For an input string to be valid:

Open brackets must be closed by the same type of brackets.( can be closed by ) only

Open brackets must be closed in the correct order. ([]) is valid, ([)] is not.

Note: An empty string is also considered valid.

Input format
One line containing a string with a bracket sequence.

Output format
Return "true" if balanced, false otherwise.

Constraints
0 <= | S | <= 10^5

Sample Input 1
()[]{}

Sample Output 1
true

Explanation 1
The given sequence of brackets is valid as per the rules specified.

Sample Input 2
([)]

Sample Output 2
false

Explanation 2
The given sequence of brackets is invalid as per the rules specified.
*/

