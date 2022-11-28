package codes;

import java.io.*;
import java.util.*;

public class candydivision {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
        long amntCandy = io.nextLong();
        TreeSet<Long> ans = new TreeSet<>();

        for (Long i = 2l; i <= Math.ceil(Math.sqrt((double)amntCandy)); i++) {
            if (amntCandy % i == 0) {
                ans.add(i);
                if (i != amntCandy / i) {
                    ans.add((amntCandy/i));
                }
            }
        }

        System.out.print(0);

        Iterator<Long> it = ans.iterator();
        while (it.hasNext()) {
        	System.out.print(" " + (it.next() - 1));
        }

        System.out.print(" " + (amntCandy - 1));
        io.close();
    }
}