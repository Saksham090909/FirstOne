package training;

public class LB_Day9 {

	public static void main(String[] args) 
	{
		//System.out.println(is_pallindrome(21215));
		//System.out.println(is_pallindrome_possible(21215));
		//System.out.println(pin(123,282,175));
		//System.out.println(weight_of_Hill_Pattern(4, 1, 5));
		//print_Hill_Pattern(4, 1, 5);
	}
	
	
	public static int is_pallindrome(int input1)
	{
		String in1 = String.valueOf(input1);
		String rev = new StringBuffer(in1).reverse().toString();
		if(in1.equals(rev))
			return 2;
		else
			return 1;
	}
	
	public static int is_pallindrome_possible(int input1)
	{
		String in = String.valueOf(input1);
		int freq[] = new int[10];
		int k = 0;
		for(char i='0';i<='9';i++)
		{
			int count = 0;
			for(int j=0;j<in.length();j++)
			{
				char a = in.charAt(j);
				if(i==a)
					count++;
			}
			freq[k++] = count;
		}
		int odd = 0;
		for(int pr : freq)
		{
			if(!(pr%2==0))
				odd++;
		}
		if(odd<=1)
			return 2;
		else
			return 1;
	}
	
	public static int pin(int input1,int input2,int input3)
	{
		int[][] arr = new int[3][3];
		String[] sarr = {String.valueOf(input1),String.valueOf(input2),String.valueOf(input3)};
		int out = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int a = sarr[i].charAt(j) - '0';
				arr[i][j] = a;
			}
		}
		int max = arr[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]>max)
					max = arr[i][j];
			}
		}
		out = out*10 + max;
		
		int min0 = arr[0][0];
		int min1 = arr[0][1];
		int min2 = arr[0][2];
		for(int i=0;i<3;i++)
		{
			if(arr[i][0]<min0)
				min0 = arr[i][0];
			if(arr[i][1]<min1)
				min1 = arr[i][1];
			if(arr[i][2]<min2)
				min2 = arr[i][2];
		}
		out = out*10 + min0;
		out = out*10 + min1;
		out = out*10 + min2;
		
		return out;
	}

	public static int weight_of_Hill_Pattern(int input1,int input2,int input3)
	{
		int out = 0;
		for(int i=0;i<input1;i++)
		{
			out += (i+1)*(input2 + i*input3);
		}
		return out;
	}
	public static void print_Hill_Pattern(int input1,int input2,int input3)
	{
		int[][] arr = new int[input1][input1];
		
		for(int i=0;i<input1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				arr[i][j] = input2 + i*input3;
				System.out.print(input2 + i*input3 + " ");
			}
			System.out.println();
		}
		
		int sum = 0;
		for(int i=0;i<input1;i++)
		{
			for(int j=0;j<input1;j++)
			{
				sum += arr[i][j];
			}
		}
		System.out.println("\nweight = " + sum);
	}
}
