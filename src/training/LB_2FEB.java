package training;

public class LB_2FEB {
	public static void main(String[] args)
	{
	}
	
	public static void weight_of_String(String s1,String s2) 
	{
		int out = 0;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()>s2.length())
			System.out.println("0");
		else 
		{
			int[] arr1 = new int[s1.length()];
			int[] arr2 = new int[s2.length()];
			
			for(int i=0;i<s1.length();i++)
				arr1[i] = s1.charAt(i);
			for(int i=0;i<s2.length();i++)
				arr2[i] = s2.charAt(i);
			
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i] == arr2[j])
						{
							arr1[i] = 0;
							arr2[j] = 0;
							break;
						}
				}
			}
			int count = 0;
			for(int a : arr1)
			{
				if(a!=0)
					count++;
			}
			if(count==0)
			{
				for(int a : arr2)
				{
					if(a!= 0)
						out += a;
				}
			}
			else
			{
				char[] arr3 = s2.toCharArray();
				for(char a : arr3)
					out += a;
			}
		}
		System.out.println(out);	
	}
	
	
}

