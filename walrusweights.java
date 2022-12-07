package codes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class walrusweights{
	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int[] arr = new int[n];
		int min= Integer.MAX_VALUE;
		int bw= 0;
		int mindiff= 1000;
		for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(in.readLine());
		
		HashSet<Integer> ws = new HashSet<Integer>();
		ws.add(0);
		
		int i = 0;
		while (i < arr.length){
			LinkedList<Integer> nweights = new LinkedList<>();
			
			for (int a : ws){
				int nw = a + arr[i];
				if (nw <= 1000) nweights.add(nw);
				else if (nw < min){
					min = nw;
					nweights.add(nw);
				}
			}
		
			for (int a : nweights) ws.add(a);
			i++;
		}
		
		for (int b : ws){
			int diff = Math.abs(1000 - b);
			if ((diff < mindiff) || (diff == mindiff && b > bw)){
				bw = b;
				mindiff = diff;
			}
		}
		System.out.println(bw);
	}

}



//package codes;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class walrusweights {
//
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		// TODO Auto-generated method stub
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n= Integer.parseInt(in.readLine());
//		if(n==1) System.out.println(Integer.parseInt(in.readLine()));
//		else {
//			
//		int i=0;
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		for(int j=0; j<n;j++) arr.add(Integer.parseInt(in.readLine()));
//		int count=0;
//		
//		while(i<n-1) {
//			ArrayList<Integer> arrnew = arr;
//			int a= arr.get(i);
//			arrnew.remove(i);
//			
//			for(int j=0; j<n;j++) {
//			
//				//arr[j]=Integer.parseInt(in.readLine());
//			}
//        	
//        	i++;
//        }
//		
//	}
//		
//	}


