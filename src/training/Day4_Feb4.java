package training;

public class Day4_Feb4 {
	public static void main(String[] args) {

		int[] arr = {4,4,5};
		System.out.println(avg_roundoff(arr, arr.length));
		System.out.println(Step_num(67898));
		System.out.println(weight_of_string("abcd","bcda"));
		System.out.println(weight_of_string("Sahithi","ihthihaS"));
		System.out.println(weight_of_string("Sahithi", "ihtihas"));
		
	}
	
	public static int avg_roundoff(int[] input1,int input2)
	{
		int sum = 0;
		int out = 0;
		for(int a : input1)
			sum += a;
		double avg = (double)sum/input2;
		double d = sum/input2;
		if(avg-d<=0.5)
			out = sum/input2;
		else
			out = sum/input2 + 1;
		return out;
	}
	
	public static String Step_num(int input1)
	{
		String in = input1 + "";
		if(in.length()==1)
			return input1+"-false";
		boolean flag = true;
		for(int i=0;i<in.length()-1;i++)
		{
			int a = Math.abs(in.charAt(i) - in.charAt(i+1));
			if(a!=1)
			{
				flag = false;
				break;
			}
		}
		if(flag==false)
			return input1+"-false";
		else
			return input1+"-true";
	}
//Day5_Feb5
	public static int weight_of_string(String input1,String input2)
	{
		int out = 0;
		for(int i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)==input2.charAt(input2.length()-1-i))
				out += i+1;
		}
		if(out%9==0)		//Single Digit Sum
			return 9;
		return out%9;
	}
}
