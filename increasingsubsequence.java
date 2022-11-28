package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class increasingsubsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int a=0;
		while(a!=0) {
			
			StringTokenizer st = new StringTokenizer(in.readLine());
			
			int x= Integer.parseInt(st.nextToken());
			if(x==0) break;
			int[] arr = new int[x];
			
			for(int i=0; i<x;i++) {
				arr[i]= Integer.parseInt(st.nextToken());
			}
			
			
		}

	}

}
