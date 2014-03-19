
import java.util.Scanner;
public class SwitchCalculator {
	public static void main(String [] args){
			
		System.out.printf("Hello, please enter two integer numbers below.\n");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
			
		System.out.printf("Please enter Add ,  Subtract , Multiply or Divide for the program to perform an arithmetic function with the numbers given\n");
		String function = input.next();
		switch (function){
			case "Add":      int sum = x+y;
						     System.out.printf("The result is %d", sum);
						     break;
			case "Subtract": int subtract = x-y;
							 System.out.printf("The result is %d", subtract);
							 break;
			case "Multiply": int multiply = x*y;
							 System.out.printf("The result is %d", multiply);
							 break;
			case "Divide":   int divide = x/y;
						     System.out.printf("The result is %d", divide);
						     break;
		
		}
	}
}

