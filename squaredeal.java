package codes;

import java.util.*;

public class squaredeal {

    public static void main(String[] args) {

		// Read the dimensions.
        Scanner stdin = new Scanner(System.in);
        int[][] dims = new int[3][2];
        for (int i=0; i<3; i++)
            for (int j=0; j<2; j++)
                dims[i][j] = stdin.nextInt();
                
		// See if it's possible and print the appropriate result.
        boolean res = go(dims);
        if (res)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
    public static boolean go(int[][] dims) {
    
        // Equal large dim case.
        if (dims[0][0] == dims[1][0]) {
            return dims[1][0] == dims[2][0] && dims[0][1]+dims[1][1] + dims[2][1] == dims[0][0];
        }
        
		// Need to form diff by dims[0][0].
        int diff = dims[0][0] - dims[0][1];
        
        // Both remaining rectangles must have diff as one dimension.
        for (int i=1; i<3; i++)
            if (diff != dims[i][0] && diff != dims[i][1]) return false;
        
		// Sum up the other dimension (not diff) over the two rectangles left.
        int sum = 0;
        for (int i=1; i<3; i++) sum += (dims[i][0] + dims[i][1] - diff);
        
        // It only works if these two sides finish up the square.
        return sum == dims[0][0];
    }
    
}