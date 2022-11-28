package codes;

import java.util.Arrays;
import java.util.Scanner;
public class cd {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

while (true)
	{
	int n = in.nextInt();
	int m = in.nextInt();
	
	if (n == 0 && m == 0)
		break;
	
	int[] cds = new int[n];
	
	int count = 0;
	
	for (int i = 0; i < n; i++)
		cds[i] = in.nextInt();
	
	for (int i = 0; i < m; i++)
		if (Arrays.binarySearch(cds, in.nextInt()) >= 0) count++;
	
	System.out.println(count);
	}

	}
}