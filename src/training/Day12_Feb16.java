package training;

public class Day12_Feb16 {
	public static void main(String[] args) {

		/*System.out.println(LongWord("Localization"));
		System.out.println(LongWord("internationalization"));
		System.out.println(LongWord("word"));*/
		
		/*char[] input1 = {'A','B','C'};
		char[] input2 = {'B','C'};
		System.out.println(FindingSum(input1, input2));*/
		
		/*System.out.println(SumDigitORAlpha("12W3i4p5ro", 0));
		System.out.println(SumDigitORAlpha("12W3i4p5ro", 1));
		System.out.println(SumDigitORAlpha("12345", 1));
		System.out.println(SumDigitORAlpha("Wipro", 0));
		System.out.println(SumDigitORAlpha("",0));*/
		
		/*System.out.println(FindPrimeandSum(1234567));
		System.out.println(FindPrimeandSum(84696));*/
	}
	
	public static String LongWord(String input1)
	{
		if(input1.length()<=10)
			return input1;
		else
			return input1.charAt(0) + String.valueOf(input1.length()-2) + input1.charAt(input1.length()-1);
	}

	public static int FindingSum(char[] input1,char[] input2)
	{
		int sum1 = 0;
		for(int i=0;i<input1.length;i++)
		{
			boolean flag = true;
			for(int j=0;j<input2.length;j++)
			{
				if(input1[i]==input2[j])
				{
					flag = false;
					input2[j] = ' ';
					break;
				}
			}
			if(flag)
				sum1 += input1[i];
		}
		for(char a : input2)
		{
			if(a!=' ')
				sum1 += a;
		} 
		if(sum1%9==0)
			return 9;
		else
			return sum1%9;
	}

	public static String SumDigitORAlpha(String input1,int input2)
	{
		if(input1.length()==0)
			return "NULL";
		String out = "";
		int sum = 0;
		if(input2==0){
			for(int i=0;i<input1.length();i++)
			{
				char a = input1.charAt(i);
				if(a>='0' && a<='9')
					sum += a -'0';
			}
			if(sum==0)
				out = "ZERO";
			else
				out = String.valueOf(sum);
		}
		else
		{	
			for(int i=0;i<input1.length();i++)
			{
				char a = input1.charAt(i);
				if(!(a>='0' && a<='9'))
					out += a;
			}
			if(out.length()==0)
				return "ZERO";
		}	
		return out;
	}

	public static String FindPrimeandSum(int input1)
	{
		String in = String.valueOf(input1);
		String out = "";
		int sum = 0;
		for(int i=0;i<in.length();i++)
		{
			int a = in.charAt(i) - '0';
			if(isPrime(a))
			{
				sum += a;
				out += a;
			}
		}
		if(sum==0 || out.length()==0)
			out = in.charAt(0) + ":" + in.charAt(in.length()-1);
		else
			out += ":" + sum;
		return out;
		}
		
	public static boolean isPrime(int a)
		{
			boolean flag = true;
			if(a<=1)
				return false;
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)
				{
					flag = false;
					break;				
				}
			}
			if(flag)
				return true;
			else
				return false;
		}
}

