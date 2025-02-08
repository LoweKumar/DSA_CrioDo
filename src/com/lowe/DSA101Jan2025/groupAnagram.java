package com.lowe.DSA101Jan2025;

import java.util.*;

class GroupAnagram {

    public List<List<String>> groupAnagram(String[] strs) {
        // HashMap to store the anagram groups
        Map<String, List<String>> map = new HashMap<>();
        
        // Traverse each string in the input array
        for (String str : strs) {
            // Sort the characters of the string to get a canonical key
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // If the sorted string is not in the map, add it with a new list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            
            // Add the original string to the list corresponding to the sorted key
            map.get(sortedStr).add(str);
        }
        
        // Convert the values of the map to a list of lists and return
        return new ArrayList<>(map.values());
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String strs[] = new String[n];
        
        // Read input strings
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }
        
        // Call the groupAnagram function to group anagrams
        List<List<String>> result = new GroupAnagram().groupAnagram(strs);

        // Print the result
        for (int i = 0; i < result.size(); ++i) {
            for (int j = 0; j < result.get(i).size(); ++j) {
                System.out.printf("%s ", result.get(i).get(j));
            }
            System.out.println();
        }
    }
}

