package training;

import java.util.Arrays;

public class LB_Day4_Feb4 {
	public static void main(String[] args) {
		System.out.println(Armstrong_basis_String(1634, "Jaya"));
	}
	
	
	
	public static String Armstrong_basis_String(int input1,String input2)
	{
		String out = "";
		input2 = input2.toLowerCase();
		char[] arr = input2.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			int count = 0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j] = ' ';
					count++;
				}
			}
			if(count>0)
				arr[i] = ' ';
		}
		for(char a : arr)
		{
			if(a!=' ')
				out += a;
		}
		
		String num = input1 + "";
		char[] n = num.toCharArray();
		Arrays.sort(n);
		
		if(is_armstrong(input1))
		{
			int diff = n[n.length-1] - '0';
			int d = 0;
			for(int i=0;i<n.length-1;i++)
			{
				d += (n[i] - '0');
			}
			out += diff - d;
		}
		else
		{
			int sum = 0;
			for(char a : n)
			{
				sum += (a-'0');
			}
			out += sum;
		}
		return out;
	}
	
	public static boolean is_armstrong(int input1)
	{
		int sum = 0;
		int or = input1;
		String in = input1 + "";
		while(input1>0)
		{
			sum += (int)Math.pow(input1%10, in.length());
			input1 /= 10;
		}
		if(sum==or)
			return true;
		else
			return false;
	}
}
