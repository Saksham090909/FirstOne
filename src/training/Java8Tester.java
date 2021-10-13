package training;

import java.util.Arrays;
import java.util.List;

interface Myinterface //functional Interface
{
	void msg(String s);
}

public class Java8Tester {
	public Java8Tester()
	{
		
	}
	public void printmsg(String s) // instance method
	{
		System.out.println(s);
	}
	public static void printmsgstatic(String s) // static method
	{
		System.out.println(s);
	}	
	public Java8Tester(String s) // constructor
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello","Welcome","Good Morning");
		
		list.forEach(s->System.out.println(s));//using lambda function
		
		System.out.println();
		
		
		list.forEach(System.out::println);//using Method reference s->System.out.println(s)
	
		System.out.println();
		
		
	
		Myinterface in1 = (String s) -> new Java8Tester().printmsg(s);//using Lambda Function
		in1.msg("Print Message using Lambda Function");
		
		Myinterface in2 = new Java8Tester()::printmsg;//using instance method reference
		in2.msg("Print Message using Method Reference to instance Method");

		Myinterface in3 = Java8Tester::printmsgstatic;//using static method reference
		in3.msg("Print Message using Method Reference to static Method");

		Myinterface in4 = Java8Tester::new;// using constructor method reference
		in4.msg("Print Message using Method Reference to constructor");
	
		

		String[] arr = {"Ball","Apple","Car"};
		Arrays.sort(arr, String::compareToIgnoreCase);
		
		for(String w : arr)
		{
			System.out.print(w + ", ");
		}
	
	}
	
}


