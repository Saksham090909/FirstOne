package training;

public class LB_Day3_Practice {
	public static void main(String[] args) {
		//System.out.println(cyclic_Sum(12345));
		//System.out.println(vowel_removal("Sahithi"));
		//System.out.println(vowel_removal("Priyas"));
		//System.out.println(vowel_removal("pjp"));
	}
	
	public static int cyclic_Sum(int input1)
	{
		String in = String.valueOf(input1);
		int sum = 0;
		
		int j=0;
		while(j<in.length())
		{
			for(int i=j;i<in.length();i++)
			{
				int a = in.charAt(i) - '0';
				sum += a;
			}
			j++;
		}
		return sum;
	}
	
	public static String vowel_removal(String input1)
	{
		String out = "";
		char[] arr = input1.toCharArray();
		int j;
		if(arr.length%2==0)
			j=0;
		else
			j=1;
		for(int i=j;i<arr.length;i+=2)
		{
			if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' 
					|| arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U')
				arr[i] = ' ';
		}
		
		for(char a : arr)
		{
			if(a!=' ')
				out += a;
		}
		return out;
	}
}
