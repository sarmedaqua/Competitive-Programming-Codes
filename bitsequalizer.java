package codes;
import java.util.Scanner;
public class bitsequalizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int z =0;
		int x = Integer.parseInt(sc.nextLine());
		while (z<x) {
			String s = sc.nextLine();
			String t = sc.nextLine();
			int a = 0;
	        int b = 0;
	        int c = 0;
	        int d = 0;
	        int e = 0;
	        int f = 0;
	        
	        for(int i = 0; i < s.length(); i++) {
	            if(s.charAt(i) == '0' && t.charAt(i) == '0') a++;
	            if(s.charAt(i) == '0' && t.charAt(i) == '1') b++;
	            if(s.charAt(i) == '1' && t.charAt(i) == '0') c++;
	            if(s.charAt(i) == '1' && t.charAt(i) == '1') d++;
	            if(s.charAt(i) == '?' && t.charAt(i) == '0') e++;
	            if(s.charAt(i) == '?' && t.charAt(i) == '1') f++;
	        }
	        
	        int ans = 0;
	        ans = Math.min(b,c);
	        b -= ans;
	        c -= ans;

	        if(b > 0) {
	            ans += b + e + f;
	        }
	        else {
	            if(f < c) {
	                ans = -1;
	            }
	            else {
	                ans += c;
	                e -= c;

	                ans += c;
	                ans += e+f;
	            }
	        }
			
			
			z++;
			System.out.println("Case "+z+": "+ans);
			
    }

	}

}
