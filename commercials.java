package codes;

	import java.io.*;
	import java.util.StringTokenizer;
	public class commercials {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			StringTokenizer sh = new StringTokenizer(in.readLine());
			
			int i=0;
			int[] arr = new int[n+1];
	        while(i<(n+1)) {
	        	if(i==0) arr[i]=0;
	        	else arr[i]=Integer.parseInt(sh.nextToken());
	        	i++;
	        }
	        int max=0;
	        int[] pro = new int[arr.length];
	        for(int j=0;j<arr.length;j++) {
	        	if(j==0) pro[j]=0;
	        	else {
	        		if(pro[j-1]>0) pro[j]=pro[j-1]+arr[j]-p;
	        		else pro[j]=arr[j]-p;
	        	}
	        	if(max<pro[j]) max=pro[j];
	        }
	        System.out.println(max);

	}

}
