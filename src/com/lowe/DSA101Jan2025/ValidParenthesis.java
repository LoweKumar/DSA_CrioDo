package com.lowe.DSA101Jan2025;

import java.io.*;
import java.util.*;

public class ValidParenthesis {
    // Implement your solution here
    public String isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.size()==0)
                return "false";

                if(ch==')' && stack.pop()!='(')
                return "false";

                if(ch=='}' && stack.pop()!='{')
                return "false";

                if(ch==']' && stack.pop()!='[')
                return "false";
            }
        }
        if(stack.size()>0)
        {return "false";}
        
        return "true";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String parenthesis = in.readLine();
        String result = new ValidParenthesis().isValid(parenthesis);
        System.out.print(String.valueOf(result));
    }
}
