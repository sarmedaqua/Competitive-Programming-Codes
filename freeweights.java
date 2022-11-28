package codes;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
public class freeweights {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringTokenizer sh = new StringTokenizer(in.readLine());
		ArrayList<Integer> row1 = new ArrayList<Integer>();
		ArrayList<Integer> row2 = new ArrayList<Integer>();
		
		int i=0;
        while(i<n) {
        	row1.add(Integer.parseInt(st.nextToken()));
        	i++;
        }
        i=0;
        
        while(i<n) {
        	row2.add(Integer.parseInt(sh.nextToken()));
        	i++;
        }
        
        List<Integer> sortedRows = new ArrayList<>(row1);
        sortedRows.addAll(row2);
        sortedRows.add(0); //If all weights are already paired, might not even lift 

        Collections.sort(sortedRows);

        //Binary Search on lists
        
        int lo = -1;
        int hi = sortedRows.size();
        int current = 0;

        while (lo + 1 < hi) {
            int mid = (lo+hi)/2;
            System.out.println("mid: " + mid);
            int midWeightFromSorted = sortedRows.get(mid);

            if (checkPair(sortedRows, current)) {
                hi = mid;
                current = midWeightFromSorted;
            } else {
                lo = mid;
            }
        } 

        System.out.println(current);
        
	}
	
	public static boolean checkPair(List<Integer> row, int currentWeight) {
        int holding = -1; //Currently holding no weight
        //System.out.println(r);
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i) > currentWeight)
                if (holding == -1) { 
                   holding = row.get(i); //Hold this weight
                }
                else {
                    if (holding != row.get(i)) { //Check the weight we are holding has the same weight as the next one
                        return false;
                    }
                    holding = -1;
                }
            }
        return holding == -1;
    }

}
