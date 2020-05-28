package kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {
	private String name;
	
	public Zad2(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		Zad2[] arr = new Zad2[10];
		Zad2 a = new Zad2("Mateusz");
		Zad2 b = new Zad2("Mati");
		Zad2 c = new Zad2("Matias");
		Zad2 d = new Zad2("Matson");
		Zad2 e = new Zad2("Matislav");
		Zad2 f = new Zad2("Mat");
		Zad2 g = new Zad2("Kox");
		Zad2 h = new Zad2("Kozak");
		Zad2 i = new Zad2("Król");
		Zad2 j = new Zad2("Mistrzu");
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		arr[5] = f;
		arr[6] = g;
		arr[7] = h;
		arr[8] = i;
		arr[9] = j;
		
		List<Zad2> list = new ArrayList<>();
		List<Zad2> subList = new ArrayList<>();
		
		for (int ii = 0; ii < arr.length; ii++) {
			list.add(arr[ii]);
		}
		
		subList = list.subList(0, 5);
		
		for (Zad2 item: list) {
			System.out.println(item.name);
		}
		System.out.println();
		
		list.removeAll(subList);
		
		for (Zad2 item: list) {
			System.out.println(item.name);
		}
	}

}
