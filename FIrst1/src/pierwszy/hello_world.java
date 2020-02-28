package pierwszy;

import java.util.Scanner;

public class hello_world {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	double number1, number2;
    	String operator, flag;
    	
    	//System.out.print(operator);
    	do {
    		number1 = scanner.nextDouble();
        	operator = scanner.next();
        	number2 = scanner.nextDouble();
        	
        	
	    	if(operator.equals("+")) {
	    		System.out.print(number1 + number2);
	    	} else if(operator.equals("-")) {
	    		System.out.print(number1 - number2);
	    	} else if(operator.equals("/")) {
	    		System.out.print(number1 / number2);
	    	} else if(operator.equals("*")) {
	    		System.out.print(number1 * number2);
	    	} else if(operator.equals("%")) {
	    		System.out.print(number1 % number2);
	    	} else {
	    		System.out.print("B³êdny operator");
	    	}
	    	
	    	System.out.println();
	    	System.out.println("Chcesz wykonaæ kolejne dzia³anie? Wpisz literê T lub N");
	    	flag = scanner.next();
	    	//System.out.print(flag);
	    	
    	} while(flag.equals("T"));
    	
    	scanner.close();
    }

}
