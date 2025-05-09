package com.lowe.DSA202May2025;

import java.util.*;


class MergeKSortedArrays{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt());
            }
            arrays.add(array);
        }
        ArrayList<Integer> ans = mergeKSortedArrays(arrays);
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
    }

    static class ArrayEntry {
        int value, arrayIndex, elementIndex;

        ArrayEntry(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> arrays) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.value));

        for (int i = 0; i < arrays.size(); i++) {
            if (arrays.get(i).size() > 0) {
                minHeap.offer(new ArrayEntry(arrays.get(i).get(0), i, 0));
            }
        }

        while (!minHeap.isEmpty()) {
            ArrayEntry curr = minHeap.poll();
            ans.add(curr.value);

            if (curr.elementIndex + 1 < arrays.get(curr.arrayIndex).size()) {
                int nextIndex = curr.elementIndex + 1;
                int nextValue = arrays.get(curr.arrayIndex).get(nextIndex);
                minHeap.offer(new ArrayEntry(nextValue, curr.arrayIndex, nextIndex));
            }
        }

        return ans;
    }
}

/* 
Problem Description
Given K sorted arrays, possibly of different sizes, merge them and print the sorted output.

Input format
First line contains an integer K - Number of arrays.

For each array there is two lines of input:

First line contains an integer n - Size of array.

Second line contains n integers - The array.

Output format
Print in single line, the elements in sorted order.

Sample Input 1
3

3

2 4 7

1

8

4

2 5 5 9

Sample Output 1
2 2 4 5 5 7 8 9

Explanation
Elements of 1st array - 2, 4, 7.

Elements of 2nd array - 8.

Elements of 3rd array - 2, 5, 5, 9.

Merging the elements and printing them in sorted order will give - 2, 2, 4, 5, 5, 7, 8, 9.

Constraints
1 <= K <= 10^5

1 <= n <= 10^5

-10^6<= Array elements <= 10^6

Note: Total number of elements will be less than 10^6.
*/