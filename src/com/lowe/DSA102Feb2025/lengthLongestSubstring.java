package com.lowe.DSA102Feb2025;
import java.util.*;

class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0, answer = 0;
        for(int right=0; right<s.length(); right++)
        {
            Integer prev = hm.get(s.charAt(right));
            if(prev!=null && prev>=left)
            {
                left = prev+1;
            }
            hm.put(s.charAt(right), right);
            answer = Math.max(answer, right-left+1);

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int result = new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
