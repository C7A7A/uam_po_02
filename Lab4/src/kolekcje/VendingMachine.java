package kolekcje;

import java.util.List;
import java.util.ListIterator;

public class VendingMachine {
	public boolean giveTheChange(List<Integer> coins) {
		int PLN1 = 0;
		int PLN2 = 0;
		int PLN5 = 0;
		ListIterator<Integer> itr = coins.listIterator();
		
		while (itr.hasNext()) {
			int coin = itr.next();
			if (coin == 1) {
				PLN1++;
			} else if (coin == 2) {
				if (PLN1 > 0) {
					PLN1--;
					PLN2++;
				} else {
					return false;
				}
			} else if (coin == 5) {
				if (PLN2 > 1) {
					PLN2 -= 2;
					PLN5++;
				} else if (PLN1 > 3) {
					PLN1 -= 4;
					PLN5++;
				} else if (PLN2 == 1 && PLN1 == 2) {
					PLN2--;
					PLN1 -= 2;
					PLN5++;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		//System.out.println("GIT");
		return true;
	}
	
	
	public static void main(String[] args) {
		VendingMachine mach = new VendingMachine();
		List<Integer> coins = List.of(1, 2, 2, 5, 2);
		mach.giveTheChange(coins);
	}
}
