package training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day10_Feb12 {
	public static void main(String[] args) {
		//System.out.println(Dictionary("orange;banana;pineapple;mango;apple;cherry;pomegranate;lemon;papaya;grape;Guava;Lichi"));
		System.out.println(Dictionary("orange;ba@nana;pineapple;mango;apple;cherry;pomegranate;lemon;papaya;grape;Guava;Lichi"));
		System.out.println(NumberBased("India", "Delhi"));
		
	}
	
	
	public static String Dictionary(String input1)
	{
		String[] arr = input1.split(";");
		String out = "";
		for(int i=0;i<arr.length;i++)
		{
			String word = arr[i].toLowerCase();
			boolean flag = false;
			for(int j=0;j<word.length();j++)
			{
				if(!(word.charAt(j)>='a' && word.charAt(j)<='z'))
					flag = true;
			}
			if(flag)
				arr[i] = "";
		}
		for(String w : arr)
			System.out.print(w + " ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
	}
		for(String w : arr)
			out += w + ";";
		return out.substring(0, out.length()-1);
	}

	public static int NumberBased(String input1,String input2)
	{
		int out = 0;
		String f = "";
		if(input1.length()<input2.length())
			f = input2.concat(input1);
		else
			f = input1.concat(input2);
		int count = 0;
		for(int i=0;i<f.length();i+=2)
			{
				out += f.charAt(i);
				count++;
			}
		out = out/count;
		
		return out;
	}
}
