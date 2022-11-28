package codes;
import java.io.*;
public class iforaneye {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=in.readLine();
			
			if(arr[i].contains("at")) arr[i]=arr[i].replace("at", "@");
			if(arr[i].contains("and")) arr[i]=arr[i].replace("and", "&");
			if(arr[i].contains("one")) arr[i]=arr[i].replace("one", "1");
			if(arr[i].contains("won")) arr[i]=arr[i].replace("won", "1");
			if(arr[i].contains("to")) arr[i]=arr[i].replace("to", "2");
			if(arr[i].contains("too")) arr[i]=arr[i].replace("too", "2");
			if(arr[i].contains("two")) arr[i]=arr[i].replace("two", "2");
			if(arr[i].contains("for")) arr[i]=arr[i].replace("for", "4");
			if(arr[i].contains("four")) arr[i]=arr[i].replace("four", "4");
			
			if(arr[i].contains("At")) arr[i]=arr[i].replace("At", "@");
			if(arr[i].contains("And")) arr[i]=arr[i].replace("And", "&");
			if(arr[i].contains("One")) arr[i]=arr[i].replace("One", "1");
			if(arr[i].contains("Won")) arr[i]=arr[i].replace("Won", "1");
			if(arr[i].contains("To")) arr[i]=arr[i].replace("To", "2");
			if(arr[i].contains("Too")) arr[i]=arr[i].replace("Too", "2");
			if(arr[i].contains("Two")) arr[i]=arr[i].replace("Two", "2");
			if(arr[i].contains("For")) arr[i]=arr[i].replace("For", "4");
			if(arr[i].contains("Four")) arr[i]=arr[i].replace("Four", "4");
			
			if(arr[i].contains("bea")) arr[i]=arr[i].replace("bea", "b");
			if(arr[i].contains("be")) arr[i]=arr[i].replace("be", "b");
			if(arr[i].contains("bee")) arr[i]=arr[i].replace("bee", "b");
			if(arr[i].contains("sea")) arr[i]=arr[i].replace("sea", "c");
			if(arr[i].contains("see")) arr[i]=arr[i].replace("see", "c");
			if(arr[i].contains("eye")) arr[i]=arr[i].replace("eye", "i");
			if(arr[i].contains("oh")) arr[i]=arr[i].replace("oh", "o");
			if(arr[i].contains("owe")) arr[i]=arr[i].replace("owe", "o");
			if(arr[i].contains("are")) arr[i]=arr[i].replace("are", "r");
			if(arr[i].contains("you")) arr[i]=arr[i].replace("you", "u");
			if(arr[i].contains("why")) arr[i]=arr[i].replace("why", "y");
			
			if(arr[i].contains("Bea")) arr[i]=arr[i].replace("Bea", "B");
			if(arr[i].contains("Be")) arr[i]=arr[i].replace("Be", "B");
			if(arr[i].contains("Bee")) arr[i]=arr[i].replace("Bee", "B");
			if(arr[i].contains("Sea")) arr[i]=arr[i].replace("Sea", "C");
			if(arr[i].contains("See")) arr[i]=arr[i].replace("See", "C");
			if(arr[i].contains("Eye")) arr[i]=arr[i].replace("Eye", "I");
			if(arr[i].contains("Oh")) arr[i]=arr[i].replace("Oh", "O");
			if(arr[i].contains("Owe")) arr[i]=arr[i].replace("Owe", "O");
			if(arr[i].contains("Are")) arr[i]=arr[i].replace("Are", "R");
			if(arr[i].contains("You")) arr[i]=arr[i].replace("You", "U");
			if(arr[i].contains("Why")) arr[i]=arr[i].replace("Why", "Y");	
			System.out.println(arr[i]);
			
		}
		
	}

}