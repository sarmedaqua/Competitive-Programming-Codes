package codes;

import java.util.*;
import java.util.function.*;
import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class monk {
	
//    static double where(double T, List<Long> where, List<Long> when) {
//    	
//        for (int i = 0; i < when.size() - 1; i++) {
//            if (when.get(i) <= T && T <= when.get(i+1)) {
//                double dt = when.get(i+1) - when.get(i);
//                double m = (where.get(i+1) - where.get(i)) / dt;
//                return where.get(i) + m * (T - when.get(i));
//            }
//        }
//        throw new Error("wrong T");
//        
//    }

//    static void read(Scanner s, int n, List<Long> where, List<Long> when, long init, int m) {
//        long height = init;
//        long time = 0;
//        where.add(height);
//        when.add(0L);
//
//        for (int i = 0; i < n; i++) {
//            int h = s.nextInt();
//            int t = s.nextInt();
//            height += h * m; 
//            time += t; 
//            where.add(height);
//            when.add(time);
//        }
//    }

    public static void main(String []args) throws IOException {
    	// TODO Auto-generated method stub
    	
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int a = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[] ah = new int[a];
        int[] at = new int[a];
        int[] dh = new int[d];
        int[] dt = new int[d];
        
        int i=0;
        while(i<a) {
        	StringTokenizer z = new StringTokenizer(in.readLine());
        	ah[i]=Integer.parseInt(z.nextToken());
        	at[i]=Integer.parseInt(z.nextToken());
        	i++;
        }
        i=0;
        while(i<d) {
        	StringTokenizer x = new StringTokenizer(in.readLine());
        	dh[i]=Integer.parseInt(x.nextToken());
        	dt[i]=Integer.parseInt(x.nextToken());
        	i++;
        }
        
        
//    	i=0;
//    	System.out.println(a+" "+d);
//    	
//    	while(i<a) {
//    		System.out.println(ah[i]+" "+at[i]);
//    		i++;
//        }
//        i=0;
//        while(i<d) {
//        	System.out.println(dh[i]+" "+dt[i]);
//    		i++;
//        }
    	
    	
//        Scanner s = new Scanner(System.in);
//        final int a = s.nextInt();
//        final int d = s.nextInt();
//        final ArrayList<Long> wherea = new ArrayList<>();
//        final ArrayList<Long> timea = new ArrayList<>();
//        read(s, a, wherea, timea, 0, 1);
//        final ArrayList<Long> whered = new ArrayList<>();
//        final ArrayList<Long> timed = new ArrayList<>();
//        read(s, d, whered, timed, wherea.get(wherea.size()-1), -1);
//
//        Function<Double, Double> A = (T) -> where(T, wherea, timea) - where(T, whered, timed);

        //double lt = binarySearch(A, 0, timed.get(timed.size()-1), 0);
        //System.out.println(lt);
    }

    /**
     * Return x in [a, b] such that f(x) = y.
     * f() must be monotonically increasing.
     * Also known as bisection method.
     */
//    static double binarySearch(Function<Double, Double> f, double low, double high, double y) {
//        // avoid excessive iterations when root is at 0.0
//        while ((high - low) > max(1e-16, 10 * Math.ulp(high))) {
//            double mid = (low + high)/2.0;
//            double midVal = f.apply(mid);
//
//            if (midVal < y)
//                low = mid;
//            else
//                high = mid;
//        }
//        return (low + high)/2.0;
//    }
}
