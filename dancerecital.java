package codes;

import java.util.*;

public class dancerecital {

	public static int n;
	public static String[] dancers;
	public static int[][] cost;

	public static void main(String[] args) {

		// Read input.
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();
		dancers = new String[n];
		for (int i=0; i<n; i++) dancers[i] = stdin.next();

		// Pre-comp...
		cost = new int[n][n];
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++)
				cost[i][j] = quick(dancers[i], dancers[j]);

		// Set up and solve.
		boolean[] used = new boolean[n];
		int[] perm = new int[n];
		System.out.println(solve(perm, used, 0));
	}

	public static int solve(int[] perm, boolean[] used, int k) {

		// Finished a permutation evaluate it.
		if (k == n) return eval(perm);

		// This is big enough.
		int res = 1000000;

		// Try each item in slot k.
		for (int i=0; i<n; i++) {
			if (!used[i]) {
				perm[k] = i;
				used[i] = true;

				// Take the better answer.
				res = Math.min(res, solve(perm, used, k+1));
				used[i] = false;
			}
		}

		// Here is our best answer.
		return res;
	}

	// Returns # of quick changes (common letters) btw a and b.
	public static int quick(String a, String b) {

		// Count how many of a's chars are in b.
		int cnt = 0;
		for (int i=0; i<a.length(); i++)
			if (b.contains(a.charAt(i)+""))
				cnt++;
		return cnt;
	}

	// Returns the cost of perm.
	public static int eval(int[] perm) {
		int res = 0;

		// Just add up the # of quick changes between each pair of adjacent dances.
		for (int i=0; i<n-1; i++)
			res += cost[perm[i]][perm[i+1]];
		return res;
	}
}
