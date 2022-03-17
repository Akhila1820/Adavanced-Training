package com.coinchange;

import java.util.Vector;

public class Denomination
{

	// All denominations of Indian Currency
		static int deno[] = {1, 2, 5, 10, 20,
		50, 100, 500, 1000};
		static int n = deno.length;

		static void findMin(int V)
		{
			// Initialize result
			Vector<Integer> ans = new Vector<>();

			// Traverse through all denomination
			for (int i = n - 1; i >= 0; i--)
			{
				// Find denominations
				while (V >= deno[i])
				{
					V -= deno[i];
					ans.add(deno[i]);
				}
			}

			// Print result
			for (int i = 0; i < ans.size(); i++)
			{
				System.out.print(
					" " + ans.elementAt(i));
			}
		}

		// Driver code
		public static void main(String[] args)
		{
			int n = 70;
			
			
			System.out.print(
				"Following is minimal number "
				+"of change for " + n + ": \n");
			findMin(n);
			
			
			int n1 = 121;
			System.out.print(
					"Following is minimal number "
					+"of change for " + n1 + ": \n");
				findMin(n1);
				
				
				int n2 = 2045;
				System.out.print(
						"Following is minimal number "
						+"of change for " + n2 + ": \n");
					findMin(n2);
		}
	
	
}
