package training;

import java.util.Arrays;

public class LB_Mile2 {
	public static void main(String[] args) {

		//System.out.println(FindStringCode("World Wide Web"));
		//System.out.println(GetCodeThroughString("Welcome in Java"));
		//System.out.println(sum_String("31259", "99871"));
		//int[] arr = {7,6,8,16,12,3};
		//SimpleEncodedArray(arr, arr.length);
		//int[] input1 = {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};
		//Decreasing_Sequencs(input1, input1.length);
		//System.out.println(most_freq_digit(input1));
		//System.out.println(SumOfPowerDigits(522109));
		//System.out.println(SumofSumofDigitsinCyclicOrder(582109));
		//System.out.println(IdentifyPossibleWord("Fi_er", "Filer:tailor:Fiter:Finer:Fiber:Fibre"));
		//EncodingThreeStrings("Johnny", "John", "Janardhan");
		
	}
	
	
	public static int FindStringCode(String input1)
	{
		String[] arr = input1.split(" ");
		   String out = "";
		   for(String word : arr)
		   {
			   word = word.toUpperCase();
			   int sum = 0;
			   int l = word.length()-1;
			   int i;
			   for(i=0;i<word.length()/2;i++)
				{
					sum += Math.abs(word.charAt(i) - word.charAt(l-i)) ;	
				}
			   if(word.length()%2!=0)
			   {
				   sum += word.charAt(i) - ('A' - 1);   
			   }
			   out += sum;
		   }
		   return Integer.parseInt(out);
	}
	
	public static String sum_String(String input1,String input2)
	{
		input1 = new StringBuffer(input1).reverse().toString();
		input2 = new StringBuffer(input2).reverse().toString();

		String zeros = "";
		int len_diff = Math.abs(input1.length()-input2.length());
		
		for(int i=0;i<len_diff;i++)
			zeros += "0";
		
		if(input1.length()>input2.length())
			input2 += zeros;
		else if(input2.length()>input1.length())
			input1 += zeros;
		
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();

		int sum=0;
		int c=0;
		String ans = "";
		for(int i=0;i<arr1.length;i++)
		{
			sum = (arr1[i]-'0') + (arr2[i]-'0') + c;
			if(sum>9)
				c = sum/10;
			else 
				c = 0;
			ans += sum%10;
			sum = 0;
		}
		if(c!=0)
			ans += c;
		ans = new StringBuffer(ans).reverse().toString();
		return ans;
	}
	
	public static int GetCodeThroughString(String input1)
	{
		String[] arr = input1.split(" ");
		int sum = 0;
		int length = 0;
		for(String w : arr)
		{
			length += w.length();
		}

		while(length>0 || sum>9)
		{
			if(length==0 && sum>9)
			{
				length = sum;
				sum = 0;
			}
			sum += length%10;
			length /= 10;
		}
		return sum;
	}
	
	public static void SimpleEncodedArray(int[] input1,int input2)
	{
		for(int i=input2-2;i>=0;i--)
		{
			input1[i] = input1[i] - input1[i+1];
		}
		int sum = 0;
		for(int n : input1)
			sum += n;
		System.out.println(input1[0] + "  " + sum);
	}
	
	public static void Decreasing_Sequencs(int[] input1,int input2)
	{
		if(input2<=1)
			System.out.println("0" + "  " + "0");
		else
		{
			int count = 1;
			int seq = 0;
			int max = 0;
			int i;
			for(i=0;i<input2-1;i++)
			{
				if(input1[i]>input1[i+1])
					count++;
				else if(input1[i]<input1[i+1] && count>1)
				{
					seq++;
					if(count>max)
						max = count;
					count = 1;
				}
			}
			if(input1[i]<input1[i-1])
			{
				seq++;
				if(count>max)
					max = count;
			}
			System.out.println(seq + "   " + max);
		}
	}
	
	public static int most_freq_digit(int[] input1)
	{
		String num = "";
		for(int a : input1)
			num += a;
		int[] freq = new int[10];
		for(int i=0;i<freq.length;i++)
		{
			int c = 0;
			for(int j=0;j<num.length();j++)
			{
				int a = num.charAt(j) - '0';
				if(a==i)
					c++;
			}
			freq[i] = c;
		}
		int max = 0;
		for(int a : freq)
		{
			if(a>max)
				max = a;
		}

		int[] freq_digs = new int[freq.length];
		int k=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==max)
			{
				freq_digs[k++] = i;
			}
		}

		int out = 0;
		for(int a : freq_digs)
			if(a>out)
				out = a;
		return out;
	}
	
	public static int SumOfPowerDigits(int input1)
	{
		String in = input1 + "";
		int sum = 0;
		for(int i=0;i<in.length()-1;i++)
		{
			int x = in.charAt(i) - '0' ;
			int y = in.charAt(i+1) - '0';
			sum += Math.pow(x,y);
		}	
		return ++sum;
	}

	public static int SumofSumofDigitsinCyclicOrder(int input1)
	{
		String num = input1 + "";
		int sum = 0;
		int j=0;
		while(j<num.length())
		{
			for(int i=j;i<num.length();i++)
			{
				int a = num.charAt(i) - '0';
				sum += a;
			}
			j++;
		}
		return sum;
	}
	
	public static String IdentifyPossibleWord(String input1,String input2)
	{
		String  out = "";
		String[] arr = input2.split(":");
		input1 = input1.toUpperCase();
		for(String a : arr)
		{
			a = a.toUpperCase();
			if(a.length()==input1.length())
			{
				boolean flag = true;
				for(int i=0;i<input1.length();i++)
				{
					if(input1.charAt(i)=='_')
						continue;
					else if(input1.charAt(i)!=a.charAt(i))
					{
						flag = false;
						break;
					}
				}
				if(flag)
				out += a + ":";
			}
		}
		String output = "";
		if(out.length()==0)
			output = "ERROR-009";
		else
		{	
			output = "";
			for(int i=0;i<out.length()-1;i++)
				output += out.charAt(i);
		}
		return output;
	}

	public static void EncodingThreeStrings(String input1,String input2,String input3)
	{
		String[] arr = {input1,input2,input3};
		String Front = "";
		String Middle = "";
		String End = "";
		for(String w : arr)
		{
			int l = w.length();
			if(l%3==0 || l%3==1)
			{
				int i,j,k;
				for(i=0;i<l/3;i++)
				{
					Front += w.charAt(i);
				}
				for(j=i;j<l-i;j++)
				{
					Middle += w.charAt(j);
				}
				for(k=j;k<l;k++)
				{
					End += w.charAt(k);
				}
			}
			else if(l%3==2)
			{	
				int i,j,k;
				for(i=0;i<=l/3;i++)
				{
					Front += w.charAt(i);
				}
				for(j=i;j<l-i;j++)
				{
					Middle += w.charAt(j);
				}
				for(k=j;k<l;k++)
				{
					End += w.charAt(k);
				}
			}
		}
		End = toggle(End);
		System.out.println(Front + " " + Middle + " " + End);
        
    }
	public static String toggle(String input)
	{
		String out = "";
		for(int i=0;i<input.length();i++)
		{
			char a = input.charAt(i);
			if(a>='a' && a<'z')
				out += (char)(a + 'A' -'a');
			else if(a>'A' && a<='Z')
				out += (char)a + 'a' - 'A';
		}
		return out;
	}
}
 
