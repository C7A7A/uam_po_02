package kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Set<String> hashSetNames = new HashSet<>();
		ArrayList<String> listNames = new ArrayList<>();
		Set<String> treeSetNames = new TreeSet<>();
		
		Scanner scanner = new Scanner(System.in);
		
		String flag = "T";
		String name = "";
		
		while (flag.equals("T")) {
			System.out.println("Podaj imie:");
			name = scanner.next();
			hashSetNames.add(name);
			listNames.add(name);
			treeSetNames.add(name);
			System.out.println("T - kontynuuj, N - zakoñcz");
			flag = scanner.next();
		}
		
		System.out.println("HashSet:");
		System.out.println(hashSetNames);
		System.out.println("ArrayList:");
		System.out.println(listNames);
		System.out.println("treeSet:");
		System.out.println(treeSetNames);
		
		scanner.close();
	}

}
