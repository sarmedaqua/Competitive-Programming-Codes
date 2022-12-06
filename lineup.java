package codes;

import java.io.*;
import java.util.StringTokenizer;

public class lineup {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int dataset= Integer.parseInt(in.readLine());
		
		int i=0;
		String[] arr = new String[dataset];
        while(i<dataset) {
        	arr[i]=in.readLine().toUpperCase();
        	
        	i++;
        }
        	
        boolean dec=false;
        boolean inc=false;
        for(int j=0;j<arr.length-1;j++){
        if(arr[j].compareTo(arr[j+1])<0)
        {
        dec=true;
        }
        else
        {
        inc=true;
        }
        
        }
        if(inc&&dec) System.out.println("NEITHER");
        else if(!inc)System.out.println("INCREASING");
        
        else System.out.println("DECREASING");
        }


	

}
