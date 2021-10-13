package training;

import java.util.Scanner;

public class User_Defined_Exception_main {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Are you corona positive??");
			String str = sc.next();
			if(str.equalsIgnoreCase("Positive"))
				throw new User_Defined_Exception(str);
		}
		catch(User_Defined_Exception e)
		{
			System.out.println(e);
		}
}
}
