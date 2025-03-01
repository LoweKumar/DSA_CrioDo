package com.lowe.DSA102Feb2025;

import java.util.*;

public class MeetingRooms {
    static class Pair implements Comparable<Pair>
    {
        int roomschange;
        int timestamp;
        Pair(int timestamp, int roomschange)
        {
            this.roomschange = roomschange;
            this.timestamp = timestamp;
        }
        public int compareTo(Pair other)
        {
            return this.timestamp - other.timestamp;
        }
    }

    public int findNumRooms(int[][] intervals) {
        List<Pair> list = new ArrayList<>();
        for(int [] interval : intervals)
        {
            list.add(new Pair(interval[0], +1));
            list.add(new Pair(interval[1], -1));
        }
        Collections.sort(list);
        int minrooms = 0, meetinginprogress= 0;
        for(Pair p: list)
        {
            meetinginprogress += p.roomschange;
            minrooms = Math.max(minrooms, meetinginprogress);
        }
        return minrooms;

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int result = new MeetingRooms().findNumRooms(nums);

        System.out.printf("%d", result);
    }

}

