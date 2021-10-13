package training;

public class LB_Mile2_B {
	public static void main(String[] args) {
		//System.out.println(Generate_Series_nth_ele(1,2,5,5));
		//System.out.println(alternate_addsub(6, 2));
		//System.out.println(Password_Stable_Unstable(123, 1223, 3443, 3445, 5555));
		//int[] arr = {10,20,30,40,50,60,70,80,90,100};
		//System.out.println(SumOfNonPrimeIndex(arr,arr.length));
		
	}
	
	public static int Generate_Series_nth_ele(int input1,int input2,int input3,int input4)
	{
		int[] arr = new int[input4];
		arr[0] = input1;
		arr[1] = input2;
		arr[2] = input3;
		
		for(int i=3;i<input4;i++)
			arr[i] = arr[i-1] + (arr[i-2] - arr[i-3]);

		return arr[input4-1];
	}
	
	public static int alternate_addsub(int input1,int input2)
	{
		int out = 0;
		if(input2==1)
		{
			for(int i=0;i<input1/2;i++)
				out++;
			if(input1%2!=0)
				out++;
		}
		else
		{
			out = input1;
			for(int i=0;i<input1/2;i++)
				out++;
		}
		return out;
	}
	public static int Password_Stable_Unstable(int input1,int input2,int input3,int input4,int input5)
	{
		String[] arr = {input1 + "",input2 + "",input3 + "",input4 + "",input5 + ""};
		int[] Stable = new int[5];
		int s = 0;
		int[] Unstable = new int[5];
		int u = 0;
		int[] freq = new int[10];
		for(String num : arr)
		{
			for(int i=0;i<freq.length;i++)
			{
				int count = 0;
				for(int j=0;j<num.length();j++)
				{
					int n = num.charAt(j) - '0';
					if(i==n)
						count++;
				}
				freq[i] = count;
			}
			int nz = 0;
			for(int n : freq)
			{
				if(n!=0)
				{
					nz = n;
					break;
				}
			}
			boolean flag = true;
			for(int n : freq)
			{
				if(n!=0 && nz!=n)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				Stable[s++] = Integer.parseInt(num);
			else
				Unstable[u++] = Integer.parseInt(num);
		}
		int sum_stable = 0;
		int sum_unstable = 0;
		for(int a : Stable)
			sum_stable += a;
		for(int a : Unstable)
			sum_unstable += a;
		return sum_stable - sum_unstable;
	}

	public static int SumOfNonPrimeIndex(int[] input1,int input2)
	{
		int out = 0;
		for(int i=0;i<input2;i++)
		{
			if(!is_prime(i))
				out += input1[i];
		}
		return out;
		
	}
	public static boolean is_prime(int num)
	{
		if(num<=1)
			return false;
		else if(num == 2)
			return true;
		else if(num%2==0)
			return false;
		for(int i=3;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	
}
