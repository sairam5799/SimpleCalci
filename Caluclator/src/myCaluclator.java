import java.util.*;
public class myCalculator {
	 public static void main(String args[]) {
	        // Create an instance of the myCalculator class
	        myCalculator calculator = new myCalculator();

	        // Call the methods and pass the numbers to perform the operations
	        int additionResult = calculator.addition(5, 3);
	        System.out.println("Addition result: " + c);

	        int subtractionResult = calculator.subtraction(10, 5);
	        System.out.println("Subtraction result: " + c1);

	        int multiplicationResult = calculator.multiplication(4, 6);
	        System.out.println("Multiplication result: " + c2);

	        int divisionResult = calculator.division(20, 4);
	        System.out.println("Division result: " + c3);
	    }
	
		public int additon(int a,int b)
		{
			//return the value;
			int c = a+b;
			return c;
		}
		public int subtraction(int a1,int b1)
		{
			//return the result
			int c1 = a1-b1;
			return c1;
		}
		public int multiplicaton(int a2,int b2)
		{
			//return the result
			int c2 = a2*b2;
			return c2;
		}
		public int division(int a3,int b3)
		{
			//return result
			int c3 = a3/b3;
			return c3;
		}
}

