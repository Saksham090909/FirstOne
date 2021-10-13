package training;

public class User_Defined_Exception extends Exception {

	private static final long serialVersionUID = 1L;

	public User_Defined_Exception(String s)
	{
		System.out.println("You're positive.Sorry you are not allowed to exams!!");
	}
}
