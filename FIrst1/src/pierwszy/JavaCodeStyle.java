package pierwszy;

import java.util.Random;

/**
 * Kody pochodz¹ z 'Thinking in Java, 2nd ed.' by Bruce Eckel
 * www.BruceEckel.com. See copyright notice in CopyRight.txt.
 * 
 */
public class JavaCodeStyle {

	private static void forLoop() {
		// TODO task 2.1
		for (char c = 0; c < 128; c++)
			if (c != 26) // ANSI Clear screen
				System.out.println("value: " + (int) c + " character: " + c);
	}

	private static void breakAndContinue() {
		for (int i = 0; i < 100; i++) {
			if (i == 74)
				break; // Out of for loop
			if (i % 9 != 0)
				continue; // Next iteration
			System.out.println(i);
		}
		int i = 0;
		// An "infinite loop":
		while (true) {
			i++;
			int j = i * 27;
			if (j == 1269)
				break; // Out of loop
			if (i % 10 != 0)
				continue; // Top of loop
			System.out.println(i);
		}
	}

	private static int test(int testval, int target) {
		int result = 0;
		if (testval > target)
			result = +1;
		else if (testval < target)
			result = -1;
		else
			result = 0; // Match
		return result;
	}

	private static int test2(int testval, int target) {
		if (testval > target)
			return +1;
		else if (testval < target)
			return -1;
		else
			return 0; // Match
	}

	private static int test3(int testval, int target) {
		// TODO task 2.2
		int result = (testval > target) ? +1 : -1;
		result = (testval == target) ? 0 : result;
		return result;
	}

	private static void tablice() {
		int[] tab2 = new int[5];
		tab2[4] = 5;
		for (int i = 0; i < tab2.length; i++)
			System.out.println(i + ": " + tab2[i]);

		int[][] tab3 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < tab3.length; i++)
			for (int ii = 0; ii < tab3[i].length; ii++)
				System.out.println(i + ": " + tab3[i][ii]);

	}

	private static void overflow() {
		int big = Integer.MAX_VALUE; // max int value
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}

	private static void bool() {
		Random rand = new Random();
		int i = rand.nextInt() % 100;
		int j = rand.nextInt() % 100;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i == j is " + (i == j));
		System.out.println("i != j is " + (i != j));

		// Treating an int as a boolean is
		// not legal Java
		// System.out.println("i && j is " + (i && j));
		// System.out.println("i || j is " + (i || j));
		// System.out.println("!i is " + !i);

		System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
	}

	public static void main(String[] args) {
		// 2.1
		forLoop();
		// 2.2
		breakAndContinue();
		// 2.3
		System.out.println(test(10, 5));
		System.out.println(test2(5, 10));
		System.out.println(test3(5, 5));
		// 2.4
		tablice();
		// 2.5
		bool();
		// 2.6
		overflow();
	}

}
