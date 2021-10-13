package training;

import java.util.Scanner;

/*Syntax  -
 * for(initialistion;condition;operation){}
 *  while(condition){}
 *  switch(expression){
 *  case x : 
 *  case y :
 *  default : 
 *  }
*/
public class Day1_P1 {
	public static void main(String[] args)
	{
		/*System.out.println("Enter input : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(is_prime(input))
			System.out.println(input + " is prime");
		else
			System.out.println(input + " is not prime");
		sc.close();
		 */		
			//System.out.println(is_even_number(2));
			//even_num();
			//System.out.println(is_prime(4));
			//prime_range(2, 19);
			//print_word('i');
			//print_Floyd_FOR();
			//Floyd_while();
			//reverse_Floyd();
			//reverse_Floyd_While();
			System.out.println(reverse_num(-1234));
			//System.out.println(pallindrome(1221));
		

	}
	
	public static boolean is_even_number(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
	
	public static void even_num()
	{
		for(int i=1;i<51;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	public static boolean is_prime(int a)
	{
		if(a<=1)
			return false;
		else if(a==2)
			return true;
		else if(a%2==0)
			return false;
		
		for(int i=3;i<a/2;i+=2)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
	
	public static void prime_range(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int count = 0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					count++;
			}
				if(count==0)
					System.out.println(i + " ");
			}
	}
	
	public static void print_word(char a)
	{
		switch(a)
		{
		case 'a' : 
			System.out.println("air");
			break;
		case 'e' : 
			System.out.println("egg");
			break;
		case 'i' : 
			System.out.println("icecream");
			break;
		case 'o' : 
			System.out.println("owl");
			break;
		case 'u' : 
			System.out.println("uno");
			break;
		default :
			System.out.println("Enter vowel in small letters!!");
			break;
		}
	}
	
	public static void print_Floyd_FOR()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Floyd_while()
	{
		int i=0;
		while(i<3)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void reverse_Floyd()
	{
		for(int i=0;i<=2;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void reverse_Floyd_While()
	{
		int i = 0;
		while(i<=2)
		{
			int j=2;
			while(j>=i)
			{
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
	}
	
	public static int reverse_num(int a)
	{
		int out = 0;
		a = Math.abs(a);
		while(a>0)
		{
			out = out*10 +  a%10;
			a = a/10;
		}
		return out;
	}
	
	public static boolean pallindrome(int b)
	{
		int a = b;

		int out = 0;
		while(a>0)
		{
			out = out*10 +  a%10;
			a = a/10;
		}
		if(out == b)
			return true;
		else
			return false;
	}
}
