package training;

import java.util.Arrays;
import java.util.Random;

public class Self_Practice {

	public static void main(String[] args)
	{	
		//System.out.println("9897501907" + " " +nambiarNumber("9897501907"));
		//System.out.println(nthprimenumber(21));
		//System.out.println(positionFibonacci(34));
		
		
	}
	public static int m(int i)
	{
		i += 2;
		//System.out.println(i);
		return i;
	}
	public static void common_letters(String input1,String input2)
	{
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		String common = "";
		String uncommon = "";
		for(int i=0;i<arr1.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					common += arr2[i];
				}
				else
				{
					uncommon += arr1[i] + arr2[j];
				}
			}
		}
		System.out.println(common + " " + uncommon);
		char[] arr3 = common.toCharArray();
		for(int i=0;i<arr3.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<arr2.length;j++)
			{
				if(arr3[i]==arr2[j])
				{
					flag = true;
					break;
				}
			}
			if(flag)
				common += arr2[i];
			else
				uncommon += arr2[i];
		}
		System.out.println(uncommon + " " + common);
	}
	public static String nambiarNumber(String str) 
    { 
		String out = "";
		//989 75 01 907 = 26 12 1 16
		int sum = str.charAt(0)-'0';
		int i;
		for(i=1;i<str.length()-1;i++)
		{
			int a = str.charAt(i)-'0';
			if(a%2==1)
				{
					sum += a;
					out += String.valueOf(sum);
					sum = str.charAt(++i)-'0';
				}
			else
				sum += a;
		}
		System.out.println(i);
		return out;
    } 
  
	public static int nthprimenumber(int input1)
	{
		int out = 0;
		int count = 0;
		int num = 2;
		while(count<input1)
		{
			boolean flag = true;
			for(int i=2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
					flag = false;
			}
			if(flag)
			{
				count++;
				out = num;
			}
			num++;
		}
		return out;
	}

	public static int positionFibonacci(int n)
	{
		if(n==0)
			return 1;
		else if(n==1)
			return 2; 
		int out = 0;
		int num = 0;
		int a = 0;
		int b = 1;
		int count = 3;
		int i=0;
		while(i<n)
		{
			num = a + b;
			if(count%2==1)
				a = num;
			else
				b = num;
			count++;
			i = num;
		}
		if(i==n)
			out = count-1;
		return out;
	}
	//Finds out time to sort array using Serial and Parallel Sort
	public static void Time_To_Sort(int[] arr)
	{
		long start = System.currentTimeMillis();
		Arrays.sort(arr);
		long end = System.currentTimeMillis();
		System.out.println("Time to Sort Using Serial Sort = " + (end - start));
		long p_start = System.currentTimeMillis();
		Arrays.parallelSort(arr);
		long p_end = System.currentTimeMillis();
		System.out.println("Time to Sort Using Parallel Sort = " + (p_end - p_start));
		
		
	}
 	//Return Smallest Postive number (>=1) that is not present in given array
	//eg : [1,2,3,1,6,4] --> 5 & [-1,-2,-3] --> 1 & [1,2,3] --> 4
	public static int Array_Demo(int[] arr)
	{
		int out = 0;
		
		return out;
	}
}
