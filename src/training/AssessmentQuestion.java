package training;
/* Question :
 * You have to determine pin using two strings as follows,
 * 1. Find Out Common alphabets between two given strings - count them and remove them 
 * 	  from both strings.
 * 2. From the remaining of those strings, remove the duplicate alphabets 
 *    (leave only unique alphabets).
 * 3. Calculate the sum of alphabet's natural positions. (A,a-1,B,b-2,..) (Case Insensitive)
 *    for both strings separately.
 * 4. Find Pin by concatenating -  
 * 		[common alphabet's count][sum of first string][sum of second string]
 * 
 * Example : 
 * input1 = "Java";
 * input2 = "Program";
 * 'a' is common in both : so count of common = 1 and after removing 'a' from both : 
 * input1 = "Jv" and input2 = "Progrm".
 * There is no duplicates in "Jv" but there is in "Progrm" i.e. 'r'.
 * So after removing 'r', input2 becomes "Pogm".
 * Sum of alphabet's position :
 * 	input1 = 10 + 22 = 32 (J + v)
 * 	input2 = (P + o + g + m) = 16 + 15 + 7 + 13 = 51
 * output = [1][32][51] = 13251 is the pin.
 * Note : if common count = 0, do not add 0 at the begining
 */
public class AssessmentQuestion {
	
	public static void main(String[] args) {
		System.out.println(pin("Java","Program")); // 1 32 51
		System.out.println(pin("Wipro","Limited")); // 1 72 54
		System.out.println(pin("Cat","Dog")); // 0 24 26 (0 to be ignored)
		System.out.println(pin("Aabb","BbCa")); // 2 0 3
		System.out.println(pin_diff_method("Wipro","Limited"));
	}
	
	public static int pin(String input1,String input2)
	{
		int out = 0;
		int count = 0;
		//Convert Strings to uppercase or lowercase for simplification.
		input1 = input1.toUpperCase();
		input2 = input2.toUpperCase();
		//finding common count and remove the common alphabets.
		for(int i=0;i<input1.length();i++)
		{
			char a = input1.charAt(i);
			if(a!='*')
			{
				for(int j=0;j<input2.length();j++)
				{
					char b = input2.charAt(j);
					if(a==b)
					{
						input1 = input1.replace(String.valueOf(a), "*");
						input2 = input2.replace(String.valueOf(b), "*");
						count++;
						break;
					}
				}
			}
		}
		//Removing duplicate alphabets from input 1
		for(int i=0;i<input1.length()-1;i++)
		{
			char a = input1.charAt(i);
			if(a!='*')
			{
				for(int j=i+1;j<input1.length();j++)
				{
					char b = input1.charAt(j);
					if(a==b)
						input1 = input1.replace(String.valueOf(a), "*");
				}
			}
		}
		//Removing duplicate alphabets from input 2
		for(int i=0;i<input2.length()-1;i++)
		{
			char a = input2.charAt(i);
			if(a!='*')
			{
				for(int j=i+1;j<input2.length();j++)
				{
					char b = input2.charAt(j);
					if(a==b)
						input2 = input2.replace(String.valueOf(a), "*");
				}
			}
		}
		//Finding sum of alphabet's postions for input 1
		int sum1 = 0;
		for(int i=0;i<input1.length();i++)
		{
			char a = input1.charAt(i);
			if(a!='*')
				sum1 += a - ('A'-1);
		}
		//Finding sum of alphabet's postions for input 2
		int sum2 = 0;
		for(int i=0;i<input2.length();i++)
		{
			char a = input2.charAt(i);
			if(a!='*')
				sum2 += a - ('A'-1);
		}
		//Concatenating and converting to Integer
		out = Integer.parseInt(count + "" + sum1 + "" + sum2);
		return out;
	}
	
	public static int pin_diff_method(String input1,String input2)
	{
		int out = 0;
		input1 = input1.toUpperCase();
		input2 = input2.toUpperCase();
		int count = 0;
		//Find common alphabets and remove them.
		for(int i=0;i<input1.length();i++)
		{
			char a = input1.charAt(i);
			for(int j=0;j<input2.length();j++)
			{
				char b = input2.charAt(j);
				if(a==b)
				{
					input1 = input1.replaceAll(String.valueOf(a),"");
					input2 = input2.replaceAll(String.valueOf(b),"");
					count++;
				}
			}
		}
		//Getting Unique alphabets
		input1 = Unique_Char(input1);
		input2 = Unique_Char(input2);
		//System.out.println(input1 + "\t" + input2);
		int sum1 = Get_Alpha_Sum(input1);
		int sum2 = Get_Alpha_Sum(input2);
		out = Integer.parseInt(String.valueOf(count) + String.valueOf(sum1) + String.valueOf(sum2));
		return out;
	}
	public static String Unique_Char(String input1)
	{
		for(int i=0;i<input1.length();i++)
		{
			char a = input1.charAt(i);
			for(int j=i+1;j<input1.length();j++)
			{
				char b = input1.charAt(j);
				if(a==b)
				input1 = input1.replaceAll(String.valueOf(a), "");
			}
		}
		return input1;
	}
	public static int Get_Alpha_Sum(String input)
	{
		input = input.toUpperCase();
		int sum = 0;
		for(int i=0;i<input.length();i++)
			sum += input.charAt(i) - ('A'-1);
		return sum;
	}
}
