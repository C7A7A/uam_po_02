package pierwszy;

import java.util.*;

public class Nazwiska2 {
	public static void main(String[] args) {
		List<String> lastNames = new ArrayList<String>();
		String flag = null;
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter last names: (enter E when you finish)");
		
		do {
			lastNames.add(scanner.next());
			flag = lastNames.get(lastNames.size() - 1);
		} while(!flag.equals("E"));
		
		lastNames.remove(lastNames.size() - 1);
		
		scanner.close();
		
		lastNames.sort(Collections.reverseOrder(Comparator.comparing(String::length)));
//		Arrays.sort(lastNames,  Collections.reverseOrder(Comparator.comparing(String::length)));
		
		for(int i = 0; i < lastNames.size(); i++) {
			System.out.println(lastNames.get(i).length() + " " + lastNames.get(i));
		}
	}
}
