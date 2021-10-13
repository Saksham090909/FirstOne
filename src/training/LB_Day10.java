package training;

public class LB_Day10 {
	public static void main(String[] args) {
		//System.out.println(second_word_capital("Wipro Technologies"));
		//System.out.println(weight_of_String("Hello World!!", 0));
		//System.out.println(weight_of_String("Hello World!!", 1));
		//System.out.println(most_freq_digit(123, 345, 364, 384));
	}
	
	public static String second_word_capital(String input1)
	{
		String[] arr = input1.split(" ");
		if(arr.length>1)
			return arr[1].toUpperCase();
		else
			return "LESS";
	}
	
	public static int is_palindrome(String input1)
	{
		if(input1.equalsIgnoreCase(reverse(input1)))
			return 2;
		else
			return 1;
	}
	public static String reverse(String input)
	{
		String rev = "";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev += input.charAt(i);
		}
		return rev;
	}
	
	public static int weight_of_String(String input1,int input2)
	{
		input1 = input1.toLowerCase();
		int out = 0;
		int val = 'a' - 1;
		if(input2==0)
		{
			for(int i=0;i<input1.length();i++)
			{	
				char a = input1.charAt(i);
				if(a>='b' && a<='z' && a!='e' && a!='i' && a!='o' && a!='u')
					out += a - val;
			}
		}
		else
		{
			for(int i=0;i<input1.length();i++)
			{
				char a = input1.charAt(i);
				if(a>='a' && a<='z')
					out += a - val;
			}
		}
		return out;
	}
	
	public static int most_freq_digit(int input1,int input2,int input3,int input4)
	{
		String in = input1 + "" + input2 + "" + input3 + "" + input4;
		int out = 0;
		
		int[] freq = new int[10];
		for(int i=0;i<freq.length;i++)
		{
			int count = 0;
			for(int j=0;j<in.length();j++)
			{
				int n = in.charAt(j) - '0';
				if(i==n)
					count++;
			}
			freq[i] = count;
		}
		
		int max = 0;
		for(int num : freq)
		{
			if(num>max)
				max=num;
		}
		
		int[] freq_dig = new int[10];
		int k=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==max)
				freq_dig[k++] = i;
		}
		
		for(int num : freq_dig)
		{
			if(num>out)
				out = num;
		}
		return out;
	}
}
