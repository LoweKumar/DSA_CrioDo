package com.lowe.DSA202May2025;
import java.util.*;

class KClosestPointsToOrigin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][] points = new long[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextLong();
            points[i][1] = sc.nextLong();
        }
        long[][] ans = kClosestPointsToOrigin(points, k);
        for (int i = 0; i < k; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }

    public static long[][] kClosestPointsToOrigin(long[][] points, int k) {
        
        PriorityQueue<long[]> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));

        for (long[] point : points) {
            long distSq = point[0] * point[0] + point[1] * point[1]; 
            maxHeap.offer(new long[]{distSq, point[0], point[1]});
            if (maxHeap.size() > k) {
                maxHeap.poll(); 
            }
        }

        long[][] result = new long[k][2];
        int i = 0;
        for (long[] entry : maxHeap) {
            result[i][0] = entry[1];
            result[i][1] = entry[2];
            i++;
        }
        return result;
    }
}

/* 
Problem Description
Given a list of points on the 2-D plane and an integer K. The task is to find K closest points to the origin and print them.

The distance between two points on a plane is the Euclidean distance.

You may return the answer in any order.

Input format
First line contains 2 integers N, K - Number of points and the integer K.

Next N lines contain 2 integers x, y - The coordinates of the points.

Output format
Print K lines each containing the coordinates of the closest points.

Sample Input 1
5 3

1 0

-4 2

2 -3

3 5

0 2

Sample Output 1
1 0

2 -3

0 2

Explanation
Distances of points are:

Point (1,0) = sqrt(1)

Point (-4,2) = sqrt(20)

Point (2,-3) = sqrt(13)

Point (3,5) = sqrt(34)

Point (0,2) = sqrt(4)

Points (1,0), (0,2) and (2,-3) have the least distance from the origin.

Constraints
1 <= N <= 10^5

1 <= K <= N

-10^6 <= Xi, Yi <= 10^6
*/