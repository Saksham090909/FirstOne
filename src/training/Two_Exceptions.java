package training;

import java.util.InputMismatchException;

public class Two_Exceptions {
	public static void main(String[] args) {
		try
		{
			int a = 100/0;
			int b = "saksham";
		}
		catch(InputMismatchException e2)
		{
			System.out.println(e2);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		}
	}
	
}
