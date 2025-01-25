package com.lowe.DSA101Jan2025;

import java.util.*;

class MostFrequent {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Object[] ans = mostFrequent(s);
        System.out.println(ans[0] + " " + ans[1]);
    }

    // TODO: Implement this method
    static Object[] mostFrequent(String s) {
        Character answer = '#';
        Integer maxFreq = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int freq = hm.getOrDefault(ch, 0)+1;
            hm.put(ch, freq);

            if(freq>maxFreq){
                answer = ch;
                maxFreq = freq;
            }
            else if(freq == maxFreq && ch<answer){
                answer = ch;

            }
        }
        return new Object[]{answer, maxFreq};
    }
}
