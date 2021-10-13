package training;

public class Day11_Feb15 {

	public static void main(String[] args) {
		/*System.out.println(StringBased("mango", 111));
		System.out.println(StringBased("chandra", 561));
		System.out.println(StringBased("Malayalam", 342));*/
		
		//System.out.println(valueoft(1, 5, 15));
	}
	
	public static String StringBased(String input1,int input2)
	{
		String out = "";
		input1 = input1.toLowerCase();
		//Least digit from input2 : 
		String in2 = String.valueOf(input2);
		int least = in2.charAt(0)-'0';
		for(int i=1;i<in2.length();i++)
		{
			int a = in2.charAt(i) - '0';
			if(a<least)
				least = a;
		}
		 
		//input2 palindrome or not ?:
		boolean pal;
		String rev = new StringBuffer(input1).reverse().toString();
		if(rev.equals(input1))
			pal = true;
		else
			pal = false;
		
		//find repetitive and non repetitive alphabets in input1 
		String rep = "";
		String nonrep = "";
		for(int i=0;i<input1.length();i++)
		{
			boolean flag = true;
			for(int j=0;j<input1.length();j++)
			{
				if(j==i)
					continue;
				else if(input1.charAt(i)==input1.charAt(j))
					{
						flag = false;
						break;
					}
				
			}
			if(flag && !nonrep.contains(input1.charAt(i) + ""))
				nonrep += input1.charAt(i);
			else if(!flag &&  !rep.contains(input1.charAt(i) + ""))
				rep += input1.charAt(i);
		}
		
		//print output based on input1 being palindrome or not
		if(!pal)
		{		
			if(rep.length()>0)
				out = rep + least;
			else
			{
				for(int i=1;i<input1.length();i+=2)
					out += input1.charAt(i);
				out += least;
			}
		}
		else
			out = nonrep + least;
		return out;
	}

	public static int valueoft(int input1,int input2,int input3)
	{
		int t = 0;
		if(isPrime(input2) && input2%2==0)
			t = input1*input1*sumofprime(input2);
		else if(isPrime(input2) && input2%2==1)
			t = input2*input2*sumofprime(input3);
		else if(!isPrime(input2) && input2%2==0)
			t = input3*input3*sumofprime(input2+input3);
		else if(!isPrime(input2) && input2%2==1)
			t = sumofprime(input1+input2+input3);
		if(isPrime(t))
			t = t + input3;
		else
			t = t - input3;
		return t;
		//throw new UnsupportedOperationException("find_tvalue(int input1,int input2,int input3)");
	}
	public static boolean isPrime(int a)
	{
		if(a<=1)
			return false;
		boolean flag = true;
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
	public static int sumofprime(int n)
	{
		int out = 0;
		int count = 0;
		int num = 2;
		while(count<n)
		{
			if(isPrime(num))
			{
				count++;
				out += num;
			}
			num++;
		}
		return out;
	}
}

