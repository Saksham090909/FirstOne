package training;

public class LB_Day5 {
	public static void main(String[] args)
	{
		//System.out.println(is_N_multipleof_M(7, 2));
		//System.out.println(count_of_even(12,3,4,5,6));
		//System.out.println(count_of_odd(12,3,4,5,6));
		//System.out.println(count_of_evenorodd(12,3,4,5,6,"odd"));
	}
	
	public static int is_N_multipleof_M(int input1,int input2)
	{
		if(input1==0 || input2==0)
			return 3;
		else if(input1%input2==0)
			return 2;
		else
			return 1;
	}
	
	public static int count_of_even(int input1,int input2,int input3,int input4,int input5)
	{
		int[] arr = {input1,input2,input3,input4,input5};
		int count = 0;
		for(int ele : arr)
		{
			if(ele%2==0)
				count++;
		}
		return count;
		
	}
	
	public static int count_of_odd(int input1,int input2,int input3,int input4,int input5)
	{
		int[] arr = {input1,input2,input3,input4,input5};
		int count = 0;
		for(int ele : arr)
		{
			if(!(ele%2==0))
				count++;
		}
		return count;
		
	}
	
	public static int count_of_evenorodd(int input1,int input2,int input3,int input4,int input5,String input6)
	{
		int[] arr = {input1,input2,input3,input4,input5};
		if(input6.equals("even"))
		{	
			int count = 0;
			for(int ele : arr)
			{
				if(ele%2==0)
					count++;
			}
			return count;
		}
		else if(input6.equals("odd"))
		{
			int count = 0;
			for(int ele : arr)
			{
				if(!(ele%2==0))
					count++;
			}
			return count;
		}
		return 0;
	}
}

