package com.lowe.DSA102Feb2025;

import java.util.*;

class SubarraySumZero{
	public static String subarraySumZero(Vector<Integer> arr)
 	{
       HashSet<Integer> pref = new HashSet<>();
	   int sum = 0;
	   pref.add(sum);
	   for(int val:arr)
	   {
		   sum+=val;
		   if(pref.contains(sum)==true)
		   {
			   return "Yes";
		   }
		   pref.add(sum);
	   }
	   return "No";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			Vector<Integer> arr=new Vector<Integer>();
			for(int i=0;i<n;i++)
			{
				arr.add(sc.nextInt());
			}
			System.out.println(subarraySumZero(arr));
		}

	}
}
