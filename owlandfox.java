package codes;
import java.util.Scanner;
public class owlandfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int allcase = sc.nextInt();
        while (allcase-- > 0) {
            int n = sc.nextInt();
            int a = n;
            int b = 1;
            while (a % 10 == 0) {
                b =b* 10;
                a =a/10;
            }
            System.out.println(n - b);
        }
        
    }
	}
