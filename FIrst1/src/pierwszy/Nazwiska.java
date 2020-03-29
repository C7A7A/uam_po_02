package pierwszy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Nazwiska {
	public static void main(String[] args) {
		String[] lastNames = new String[args.length];
		
		for(int i = 0; i < args.length; i++) {
			lastNames[i] = args[i];
		}
		
		Arrays.sort(lastNames,  Collections.reverseOrder(Comparator.comparing(String::length)));
		
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(lastNames[i].length() + " " + lastNames[i]);
		}
		
	}
}
