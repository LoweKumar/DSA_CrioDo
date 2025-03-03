package com.lowe.DSA102Feb2025;

import java.util.*;

// Implement your solution here
class LongestSubstringWithAtMostKDistinctCharacter {

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, maxLength = 0;
        
        while (end < s.length()) {
            // Add character to map and extend the window
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            end++;
            
            // If the map size exceeds 'k', shrink the window from the start
            while (map.size() > k) {
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);
                
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                start++;
            }
            
            // Calculate the max length of valid substring
            maxLength = Math.max(maxLength, end - start);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();  // Consume newline after integer input
        String s = scanner.nextLine();
        scanner.close();

        int result = new LongestSubstringWithAtMostKDistinctCharacter().lengthOfLongestSubstringKDistinct(s, k);
        System.out.println(result);
    }
}