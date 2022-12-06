package codes;
import java.io.*;
public class snakesandmasters {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[n];
        if(n==1){
        System.out.print("1");
        return;
        }
        arr[0] = 1;
        arr[1] = 2;
        if(n >= 2)
        for(int i = 2; i < n; i++){
            arr[i] = (arr[i-1] + arr[i-2])%1000000;
        }
        System.out.print(arr[n-1]);
        System.out.close();
    }
    }