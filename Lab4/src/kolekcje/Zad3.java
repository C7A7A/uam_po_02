package kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Zad3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		List<Integer> numsRev = new ArrayList<>();
		Integer lastEle = 0;
		
		for (int i = 0; i < 10; i++) {
			nums.add(i);
		}
		
		ListIterator<Integer> itr = nums.listIterator();
		
		while (itr.hasNext()) {
			lastEle = itr.next();
		}
		
		System.out.println(nums);
		
		while (itr.hasPrevious()) {
			lastEle = itr.previous();
			numsRev.add(lastEle);
		}
		
		System.out.println(numsRev);

	}

}
