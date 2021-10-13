package training;

public class LB_Day8 {
	public static void main(String args[])
	{	
		//System.out.println(sum_to_single_digit(99999));
		//System.out.println(evenDigitSum(1328));
		//System.out.println(oddDigitSum(1294));
		//System.out.println(evenORoddDigitSum(1328, "odd"));
	}
	public static int sum_to_single_digit(int input1)
	{
		int in = input1;
		if(input1<0)
			input1 = -1*input1;
		int sum = 0;
		while(input1>0 || sum>9)
		{
			if(input1==0 && sum > 9)
			{
				input1 = sum;
				sum = 0;
			}
			sum += input1%10;
			input1 = input1/10;
		}
		if(in<0)
			sum = -1*sum;
		return sum;
		
	}
	public static int evenDigitSum(int input1)
	{
		int sum = 0;
		String in1 = String.valueOf(input1);
		for(int i=0;i<in1.length();i++)
		{
			int a = in1.charAt(i) - '0';
			if(a%2==0)
				sum += a;
		}
		return sum;
	}
	
	public static int oddDigitSum(int input1)
	{
		int sum = 0;
		while(input1>0)
		{
			int a = input1%10;
			if(!(a%2==0))
				sum += a;
			input1 = input1/10;
		}
		return sum;
	}
	
	public static int evenORoddDigitSum(int input1,String input2)
	{
		int out = 0;
		if(input2.equals("odd"))
		{
			int sum = 0;
		while(input1>0)
		{
			int a = input1%10;
			if(!(a%2==0))
				sum += a;
			input1 = input1/10;
		}
		out = sum;
		}
		else if(input2.equals("even"))
		{
			int sum = 0;
		while(input1>0)
		{
			int a = input1%10;
			if((a%2==0))
				sum += a;
			input1 = input1/10;
		}
		out = sum;
		}
		return out;
			
	}
}
