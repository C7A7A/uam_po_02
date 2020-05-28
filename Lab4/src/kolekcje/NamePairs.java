package kolekcje;

import java.util.HashMap;
import java.util.Scanner;

public class NamePairs {

	public static void main(String[] args) {
		HashMap<String, String> names = new HashMap<>();
		String name1 = "";
		String name2 = "";
		String nameToFind = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Wprowadz pary imion, aby zakoñczyæ wpisz -");
		while (!name1.equals("-")) {
			name1 = scanner.next();
			name2 = scanner.next();
			if (name1 != "-" && name2 != "-") {
				names.put(name1, name2);
			}	
		}
		
		System.out.println("Podaj jedno z imion");
		nameToFind = scanner.next();
		System.out.println(names.get(nameToFind));
		
	}

}
