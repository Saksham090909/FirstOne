package training;

public class Day6_Feb8 {
	public static void main(String[] args) {
		String a = "value" + null;
		System.out.println(a.length());
	}
	
	public static char returnACharacterbasedonString(int input1,String input2)
	{
		int out = 0;
		String in1 = input1 + "";
		int sum = 0;
		for(int i=0;i<in1.length();i++)
		{
			int a = in1.charAt(i) - '0';
			if(input2.equals("even") && i%2==1)
				sum += a*a;
			else if(input2.equals("odd") && i%2==0)
				sum += a*a;
		}
		int k = sum;
		if(sum>26)
		{
			int s = 0;
			while(sum>0 || s>26)
			{
				if(sum ==0 && s>26)
				{
					sum = s;
					s = 0;
				}
				s += sum%10;
				sum /= 10;
			}
			k = s;
		}
		if(k<27 && input2.equals("odd"))
			out = 'A' + (k-1);
		else if(k<27 && input2.equals("even"))
			out = 'a' + (k-1);
		return (char)out;
	}
}
