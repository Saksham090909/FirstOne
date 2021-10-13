package training;

public class LB_Day4 {
	public static void main(String[] args)
	{
		System.out.println(is_even(13));
		//System.out.println(is_odd(13));
		//System.out.println(last_digit(-123));
		//System.out.println(second_last_digit(123));
		//System.out.println(sum_of_Last_digits(267, -154));	
	}
	public static int is_even(int input1)
	{
		if(input1%2==0)
			return 2;
		else 
			return 1;
	}
	public static int is_odd(int input1)
	{
		if(!(input1%2==0))
			return 2;
		else 
			return 1;
	}
	public static int last_digit(int input1)
	{
		String in1 = String.valueOf(input1);
		in1 = new StringBuffer(in1).reverse().toString();
		return in1.charAt(0)-'0';
	}
	public static int second_last_digit(int input1)
	{
		if(input1>=-9 && input1<=9)
			return -1;
		String in1 = String.valueOf(input1);
		in1 = new StringBuffer(in1).reverse().toString();
		return in1.charAt(1) - '0';
	}
	
	public static int sum_of_Last_digits(int input1,int input2)
	{
		int out = 0;
		String in1 = String.valueOf(input1);
		String in2 = String.valueOf(input2);
		in1 = new StringBuffer(in1).reverse().toString();
		in2 = new StringBuffer(in2).reverse().toString();
		char a = in1.charAt(0);
		char b = in2.charAt(0);
		out = a + b - 2*'0';
		return out;
	}
}
