package com.lowe.DSA102Feb2025;

import java.io.*;
import java.util.*;

public class ValidAnagram {
    public boolean validAnagram(String s, String t)
     {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char ch: s.toCharArray())
        {
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);

        }
        for(char ch: t.toCharArray())
        {
            charCount.put(ch, charCount.getOrDefault(ch, 0)-1);

        }

        for(Map.Entry<Character, Integer> entry: charCount.entrySet())
        {
            if(entry.getValue() != 0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String t = in.readLine();

        boolean result = new ValidAnagram().validAnagram(s, t);
        System.out.print(String.valueOf(result));
    }
}