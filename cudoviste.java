package codes;

import java.io.*;
import java.util.StringTokenizer;


public class cudoviste {
    public static void main(String args[]) throws Exception {
    	// TODO Auto-generated method stub
    	
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());
        char[][] map = new char[n][m];
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            for(int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        
        int[] arr = new int[5];
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < m - 1; j++) {
                if(map[i][j] == '#' || map[i + 1][j] == '#' || map[i][j + 1] == '#' || map[i + 1][j + 1] == '#') continue;
                else {
                	int count = 0;
                    if(map[i][j] == 'X') count++;
                    if(map[i + 1][j] == 'X') count++;
                    if(map[i][j + 1] == 'X') count++;
                    if(map[i + 1][j + 1] == 'X') count++;
                    arr[count]++;
                }
                
            }
        }
        for(int i : arr) System.out.println(i);
        
    }

}