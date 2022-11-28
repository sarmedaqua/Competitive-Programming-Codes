package codes;

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class jugglingpatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line;
		while(sc.hasNextLine()) {
			line= sc.nextLine();
			
			int sum = 0;
			for (int i=0; i<line.length();i++) sum+=line.charAt(i)-'0';
			
			if (sum % line.length() != 0) {
				System.out.println(line+": invalid # of balls");
				continue;
			}
			
			int balls = sum / line.length();
			boolean wrong = false;
			
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			
			for (int i = 0; i < line.length() * 100; i++) {
			
			if (line.charAt(i % line.length()) == '0') {
				if (pq.size()<1 && (pq.peek()==i)) {
					wrong = true;
				}
			} else {
				if (balls > 0 && (pq.isEmpty() || pq.peek() > i)) {
					balls--;
					pq.add(i + line.charAt(i % line.length()) - '0');
					continue;
				}

				if (pq.size()>0) {
					if (pq.peek() == i) {
						pq.remove();
						wrong = pq.size()<1 && pq.peek() == i;
					} else {
						wrong = true;
					}
				}

				pq.add(i + line.charAt(i % line.length()) - '0');
			}
			}
			if (wrong) {
				System.out.println(line+": invalid pattern");
			} else {
				System.out.println(line+": valid with "+sum / line.length()+" balls");
			}
			
			
			
		}
		
	}

}
