package com.lowe.DSA201April2025;

import java.util.*;

class PostfixExpressionDSA {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) 
    {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");
        for(String token : tokens)
        {
            if(isOperator(token))
            {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;
                switch(token)
                {
                    case "+":
                    result = a+b;
                    break;
                    case "-":
                    result = a-b;
                    break;
                    case "*":
                    result = a*b;
                    break;
                    
                }
                stack.push(result);
            }
            else
            {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    static boolean isOperator(String token)
    {
        return token.equals("+")||token.equals("-")||token.equals("*");
    }
}