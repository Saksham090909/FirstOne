package training;

public class Day9_Feb11 {
	public static void main(String[] args) {
		/*System.out.println(StringBased("hidasyun", "hyd;blr;delhi;goa;chennai;india;usa;idn"));
		System.out.println(StringBased("mabgtinlope", "mango;apple;banana;guava;tea;ice;nut;grape;lemon"));
		System.out.println(StringBased("abcrstuv", "bike;car;jeep;taxi;bus;van;boat"));*/
		
		//System.out.println(NumberBased(1234, 5678));
		
		/*int[] arr1 = {14,23,54,21};
		System.out.println(ArrayBased(arr1, arr1.length));
		int[] arr2 = {1,2,3,4,5};
		System.out.println(ArrayBased(arr2, arr2.length));*/
	}
	
	public static String StringBased(String input1,String input2)
	{
		String out = "";
		String[] arr = input2.split(";");
		int count = 0;
		for(String a : arr)
		{
			boolean flag = true;
			for(int i=0;i<a.length();i++)
			{
				if(!input1.contains(a.charAt(i) + ""))
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{	
				out += a + ";";
				count++;
			}
		}
		out = out.substring(0, out.length()-1) + count;
		return out;
	}

	public static int NumberBased(int input1,int input2)
	{
		int out = 0;
		String in = input1 + "" + input2;
		String even = "";
		String odd = "";
		for(int i=0;i<in.length();i++)
		{
			int a = in.charAt(i) - '0';
			if(a%2==0)
				even += a;
			else
				odd += a;
		}
		int even_sum = 0;
		int odd_sum = 0;
		for(int i=0;i<even.length();i++)
		{
			int a = even.charAt(i) - '0';
			if(i%2==0)
				even_sum += a;
			else
				odd_sum += a;
		}
		int from_even = Math.abs(even_sum - odd_sum);
		even_sum = 0;
		odd_sum = 0;
		for(int i=0;i<odd.length();i++)
		{
			int a = odd.charAt(i) - '0';
			if(i%2==0)
				even_sum += a;
			else
				odd_sum += a;
		}
		int from_odd = Math.abs(even_sum - odd_sum);
		out = from_even*from_odd;
		return out;
	}

	public static int ArrayBased(int[] input1,int input2)
	{
		int out = 0;
		for(int i=0;i<input1.length;i++)
		{
			if(input2%2==0 && i%2==0)
				input1[i] = 0;
			else if(input2%2==1 && i%2==1)
				input1[i] = 1;
		}
		int sum = 0;
		for(int a : input1)
			sum += a;
		if(sum%9==0)
			out = 9;
		else
			out = sum%9;
		return out;
	}
}
