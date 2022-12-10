package codes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class grasshopper {
	StringTokenizer st = new StringTokenizer("");
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	String nextToken() throws Exception {
		while (!st.hasMoreTokens()) st = new StringTokenizer(input.readLine());
		return st.nextToken();
	}
	static void enqueue(int x, int y, int d) {
		if (x < 0 || x >= xx || y < 0 || y >= yy) return;
		if (dist[x][y] != 0) return;
		dist[x][y] = d;
		qx[qe] = x; qy[qe++] = y;
	}
	public static boolean main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer("");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String in = input.readLine();
		
		static final int MAX = 100, MAX2 = MAX*MAX;
		
		int xx, yy;
		int[] qx = new int[MAX2], qy = new int[MAX2];
		int qb, qe;
		int[][] dist;
		if (in == null) return false;
		st = new StringTokenizer(in);
		xx = Integer.parseInt(nextToken()); yy = Integer.parseInt(nextToken());
		int x1 = Integer.parseInt(nextToken())-1, y1 = Integer.parseInt(nextToken())-1, x2 = Integer.parseInt(nextToken())-1, y2 = Integer.parseInt(nextToken())-1;
		dist = new int[xx][yy];
		qb = qe = 0;
		enqueue(x1, y1, 1);
		while (qb < qe && dist[x2][y2] == 0) {
			int x = qx[qb], y = qy[qb++], d = dist[x][y] + 1;
			enqueue(x+1, y+2, d); enqueue(x+2, y+1, d);
			enqueue(x+1, y-2, d); enqueue(x+2, y-1, d);
			enqueue(x-1, y+2, d); enqueue(x-2, y+1, d);
			enqueue(x-1, y-2, d); enqueue(x-2, y-1, d);
		}
		System.out.println((dist[x2][y2] == 0) ? "impossible" : String.valueOf(dist[x2][y2]-1));
		return true;
	}
	
	
	
	
}

	
