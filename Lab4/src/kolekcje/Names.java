package kolekcje;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Names {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		String name = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wprowadz imiona, aby zakoñczyæ wpisz -");
		while (!name.equals("-")) {
			name = scanner.next();
			if (!name.equals("-")) {
				names.add(name);
			} 
		}
		scanner.close();
		System.out.println(names.size());
	}

}
