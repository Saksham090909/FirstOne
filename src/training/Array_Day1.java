package training;

import java.util.Arrays;

public class Array_Day1 {
	public static void main(String[] args)
	{
		int[] arr = {0,1,5,5};
		int[][] arr_2D = {{3,4},{5,6}};
		//System.out.println(sum(arr));
		//System.out.println(index_out_of_bound(arr));
		//System.out.println(max_array(arr));
		//System.out.println(min_array(arr));
		//sort_array(arr);
		//even_odd(arr);
		//remove_duplicates(arr);	
		System.out.println(index_search(arr, 5));
		//biggest_in_2D(arr_2D);
		//smallest_in_2D(arr_2D);
	}
	
	public static int sum(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
	
	public static int index_out_of_bound(int[] arr)
	{
		return arr[arr.length+1];
	}
	
	public static int max_array(int[] arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	
	public static int min_array(int[] arr)
	{
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}
	
	public static void sort_array(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i : arr)
			System.out.print(i + " ");
	}
	
	public static void even_odd(int[] arr)
	{
		Arrays.parallelSort(arr);;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				arr[i] = 0;
			else
				arr[i] = 1;
		}
		for(int num : arr)
			System.out.print(num + " ");
	}
	
	public static void remove_duplicates(int[] arr)
	{
		Arrays.sort(arr);
		int j = 0;  
        for (int i=0; i<arr.length-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                arr[j] = arr[i];
                j++;
            }  
         }  
        arr[j] = arr[arr.length-1];
        j++;
        
        for(int i=0;i<j;i++)
			System.out.print(arr[i] + " ");
    }
	
	public static String index_search(int[] arr,int ele)
	{
		boolean flag = false;
		int i;
		for( i=0;i<arr.length;i++)
			if(arr[i]==ele)
				{
					flag = true;
					break;
				}
		return flag ? "Element found at " + i : "Element Not Found";
	}
	
	public static void biggest_in_2D(int[][] arr)
	{
		int big = arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] > big)
					big = arr[i][j];
			}
		}
		System.out.println("Biggest Element is " + big);
	}
	
	public static void smallest_in_2D(int[][] arr)
	{
		int small = arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j] < small)
					small = arr[i][j];
			}
		}
		System.out.println("Smallest Element is " + small);
	}
}

	