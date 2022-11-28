package codes;
import java.io.*;
import java.util.StringTokenizer;

public class alicedigital {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int dataset= Integer.parseInt(in.readLine());
		
		int i=0;
        while(i<dataset) {
        	StringTokenizer z = new StringTokenizer(in.readLine());
        	int n = Integer.parseInt(z.nextToken());
        	int m = Integer.parseInt(z.nextToken());
        	StringTokenizer a = new StringTokenizer(in.readLine());
        	
        	int[] arr = new int[n];
        	int mcount=0;
        	
        	for(int j=0; j<n;j++) {
        		arr[j]= Integer.parseInt(a.nextToken());
        		if(arr[j]==m) mcount++;
        	}
        	
        	int count=0;
        	int w=0;
        	for(int j=0; j<n;j++) {
        		if(arr[j]==m) {
        			
        		}
        	}
        	
        	i++;
        }
        

	}

}
