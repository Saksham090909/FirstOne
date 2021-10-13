package training;

import java.util.Arrays;

public class LB_Day7 {
	public static void main(String[] args)
	{
		//System.out.println(count_of_prime_in_range(2, 20));
		//System.out.println(unique_digits(292));
		//System.out.println(non_repeated_digits(292));
	}
	
	public static int count_of_prime_in_range(int input1,int input2)
	{
		int count = 0;
		for(int i=input1;i<=input2;i++)
		{
			boolean flag = true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				count++;
		}
		return count;
	}
	
	public static int count_digits(int input1)
	{
		int count = 0;
		while(input1>0)
		{
			input1 = input1/10;
			count++;
		}
		return count;
		
		/*
		  String in = String.valueOf(input1);
		  return in.length();
		 */
	}
	
	public static int unique_digits(int input1)
	{
		String in = String.valueOf(input1);
		char[] arr = in.toCharArray();
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j] = arr[i];
				j++;
			}	
		}
		arr[j] = arr[arr.length-1];
		j++;
	
		return j;

	}
	
	public static int non_repeated_digits(int input1)
	{
		String in = String.valueOf(input1);
		char[] arr = in.toCharArray();
		Arrays.sort(arr);
		int[] freq = new int[10];
		int k=0;
		for(char i='0';i<='9';i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
					c++;
			}
			freq[k++] = c;
		}
		int out = 0;
		for(int pr : freq)
		{
			if(pr==1)
				out++;
		}
		return out;
	}
}
