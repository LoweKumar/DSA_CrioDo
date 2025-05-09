import java.util.*;

class MaxKProfit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        long res = maxKProfit(n, b, a);

        System.out.println(res);
    }

    static long maxKProfit(int N, int B, int[] a) {
       
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int seats : a) {
            maxHeap.offer(seats);
        }

        long profit = 0;
        while (B > 0 && !maxHeap.isEmpty()) {
            int curr = maxHeap.poll();
            profit += curr;
            B--;
            if (curr - 1 > 0) {
                maxHeap.offer(curr - 1);
            }
        }

        return profit;
    }
}

/* 
Problem Description
Given an array A, where A[i] is the number of vacant seats in the ith row in a stadium.

There are B people in a queue waiting to buy the tickets.

Each seat costs equal to the number of vacant seats in the row it belongs to.

The task is to maximize the profit by selling the tickets to B people.

NOTE: If all the tickets are sold then rest have to go empty handed.

Input format
First line contains two space separated integers N and B.

Second line contains N space separated integers representing the array A.

Output format
Print answer in a single line

Sample Input 1
2 3

2 3

Sample Output 1
7

Explanation
First ticket will be for any seat of second row will be sold for Rs 3.

Second ticket will be for any seat of second row which will be sold for 2 because only 2 seats were left in the second row at that time.

Third ticket will be for any seat in first row will be sold for 2.

Constraints
1 <= N <= 100000

1 <= |A| <= 100000

1 <= B <= 200000
*/