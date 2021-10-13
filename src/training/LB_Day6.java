package training;

public class LB_Day6 {
	public static void main(String[] args)
	{
		//System.out.println(is_prime(23));
		//System.out.println(factorial(5));
		//System.out.println(nthFibonacci(9));
		System.out.println(nthprime(5));
		
	}
	
	public static int is_prime(int input1)
	{
		if(input1<=0)
			return 1;
		else if(input1==2)
			return 2;
		else if(input1%2==0)
			return 1;
		for(int i=3;i<input1/2;i+=2)
		{
			if(input1%i==0)
				return 1;
		}
		return 2;
	}
	
	public static int factorial(int input1)
	{
		int f = 1;
		for(int i =1;i<=input1;i++)
		{
			f = f*i;
		}
		return f;
	}
	
	public static int nthFibonacci(int input1)
	{
		int fib[] = new int[input1+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<input1;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		return fib[input1-1];
	}
	
	public static int nthprime(int input1)
	{
		int count = 0,prime = 1,i;
		while(count<input1)
		{
			prime++;
			for(i=2;i<=prime;i++)
			{
				if(prime%i == 0)
					break;
			}
			if(i==prime)
				count++;
		}
		return prime;
	}
}

