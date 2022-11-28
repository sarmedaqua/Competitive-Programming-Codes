package codes;
import java.util.Scanner;

public class shuffling {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int a = Integer.parseInt(in.next());
//		String b = in.next();
//		if(b.equals("out")) {
//			
//		}
//		else {
//			
//		}
//	}
	public static final int MAX = 10000;
	public static int[] deck = new int[MAX];

	public static boolean check(int n)
	{
		for(int i=0; i<n; i++)
			if (deck[i] != i)
				return false;
		return true;
	}

	public static void performInShuffle(int n)
	{
		int[] tmp = new int[n];
		for(int i=0; i<n; i++)
			tmp[i] = deck[i];
		int j=n/2;
		int k=0;
		for(int i=0; i<n/2; i++) {
			deck[k++] = tmp[j++];
			
			deck[k++] = tmp[i];
		}
		if (n%2 == 1)
			deck[n-1] = tmp[n-1];
	}

	public static void performOutShuffle(int n)
	{
		int[] tmp = new int[n];
		for(int i=0; i<n; i++)
			tmp[i] = deck[i];
		int j=(n+1)/2;
		
		
		int k=0;
		for(int i=0; i<n/2; i++) {
			//System.out.println(k);
			deck[k++] = tmp[i];
			//System.out.println(j);
			deck[k++] = tmp[j++];
			
		}
		if (n%2 == 1)
			deck[n-1] = tmp[n/2];
	}
	
	public static void main(String [] args)
	{
		for(int i=0; i<MAX; i++)
			deck[i] = i;			// should only have to do this once
	
		int n;
		String type;
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
			type = in.next();
			boolean ok = false;
			int count = 0;
			while (!ok) {
				if (type.charAt(0) == 'o')
					performOutShuffle(n);
				else
					performInShuffle(n);
				count++;
				ok = check(n);
			}
			System.out.println(count);
	}

}
