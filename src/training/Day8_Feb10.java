package training;


public class Day8_Feb10 {
	public static void main(String[] args){
		/*System.out.println("Early Morning Connect Session!!--> " + StringSpecialCharacter("Early Morning Connect Session!!"));
		System.out.println("Good Moring! --> " + StringSpecialCharacter("Good Morning!"));
		System.out.println("@SakshamSinha--> "+StringSpecialCharacter("@SakshamSinha"));*/
	
		/*System.out.println("02, Feb, 2040-->" + DateCheckPalindrome(02, "Feb", 2040));
		System.out.println("30, Feb, 2020--> "+DateCheckPalindrome(30, "Feb", 2020));
		System.out.println("02, Feb, 2020--> "+DateCheckPalindrome(02, "Feb", 2020));
		System.out.println("21, Mar, 2005--> "+DateCheckPalindrome(21, "Mar", 2005));*/
		System.out.println(ConsonentVowel("iNd", "eie"));
			
	}
	public static String StringSpecialCharacter(String input1)
	{
		char[] arr = input1.toCharArray();
		String out = "";
		for(int i=0;i<arr.length;i++)
		{
			if(!out.contains(arr[i] + "") && arr[i]>='a' && arr[i] <= 'z' || arr[i]>='A' && arr[i] <= 'Z')
			{
				int count = 1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i] == arr[j])
						{
							count++;
							break;
						}
				}
				if(count==2)
					out += arr[i];
			}
		}
		if(out == "")
			return null;
		int special = 0;
		for(char a : arr)
		{
			if(!(a>='a' && a<='z' || a>='A' && a<'Z' || a>='0' && a<='9'))
				special++;
		}	
		String result = "";
		if(special%2==0)
		{
			for(int i=0;i<out.length();i+=2)
				result += out.charAt(i);
		}
		else
			for(int i=1;i<out.length();i+=2)
				result += out.charAt(i);
			
		return result;
	}
	public static String DateCheckPalindrome(int input1,String input2,int input3)
	{
		String out = "";
		String inv = "invalid data!";
		if(input3<2000 || input3>2030 || input1<1 || input1>31)
			return inv;
		int month = 0;
		switch (input2.toLowerCase()) {
		case "jan":
			month = 1; 
			break;
		case "feb":
			if(input1>28)
				return inv;
			month = 2; 
			break;
		case "mar":
			month = 3; 
			break;
		case "apr":
			if(input1>30)
				return inv;
			month = 4; 
			break;
		case "may":
			month = 5; 
			break;
		case "jun":
			if(input1>30)
				return inv;
			month = 6; 
			break;
		case "jul":
			month = 7; 
			break;
		case "aug":
			month = 8; 
			break;
		case "sep":
			if(input1>30)
				return inv;
			month = 9; 
			break;
		case "oct":
			month = 10; 
			break;
		case "nov":
			if(input1>30)
				return inv;
			month = 11; 
			break;
		case "dec":
			month = 12; 
			break;
		default:
			return inv;
		}
		String pal = "";
		if(input1<10)
			pal += "0"+input1;
		else
			pal += input1;
		if(month<10)
			pal += "0"+month;
		else
			pal += month;
		pal+=input3;
		String rev = new StringBuffer(pal).reverse().toString();
		if(pal.equals(rev))
			out = "Palindrome"+pal;
		else
			out = "Palindrome not possible";
		return out;
	}
	public static String ConsonentVowel(String input1,String input2)
	{
		String out = "";
		String in1 = input1;
		String in2 = input2;
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		String comm = "";
		int vow = 0;
		int cons = 0;
		for(int i=0;i<input1.length();i++)
		{
			int count = 1;
			for(int j=0;j<input2.length();j++)
			{
				if(input1.charAt(i)==input2.charAt(j))
					{
						comm += input2.charAt(j);
						count++;
					}
			}
			if(count>1)
				comm += input1.charAt(i);
		}
		for(int i=0;i<comm.length();i++)
		{
			char a = comm.charAt(i);
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
				vow++;
			else
				cons++;
		}
		if(cons>vow)
		{
			if(in1.length()>in2.length())
				out = toggle(in2);
			else
				out = toggle(in1);
		}
		else if(cons==vow)
		{
			out = toggle(in1+in2);
		}
		else if(cons<vow)
		{
			if(in1.length()>=in2.length())
				out = toggle(in1);
			else
				out = toggle(in2);
		}
		System.out.println(comm + " " + vow + " " + cons);
		
		return out;
	}
	public static String toggle(String input)
	{
		String out = "";
		for(int i=0;i<input.length();i++)
		{
			char a = input.charAt(i);
			if(Character.isLowerCase(a))
				out += Character.toUpperCase(a);
			else
				out += Character.toLowerCase(a);
		}
		return out;
	}

}
