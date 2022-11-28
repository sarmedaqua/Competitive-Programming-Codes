package codes;
import java.io.*;
import java.util.StringTokenizer;
public class firefly {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
		
        int[] bot = new int[h];
        int[] top = new int[h];
        
        for(int i = 0; i < n; i++) {
            int height = Integer.parseInt(in.readLine());
            if(i % 2 == 0) {
                bot[height - 1]++;
            }
            else {
                top[h - height]++;
            }
        }
        
        for(int i = 0; i < bot.length; i++) {
        	System.out.println(bot[i]+" "+top[i]);
        }
        
        
	}

}
