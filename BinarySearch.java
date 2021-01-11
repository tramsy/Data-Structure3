package com.datastructure;

public class BinarySearch
{
	public static void main(String[] ar)
	{
		BinarySearch obj = new BinarySearch();
		int[] arry = {22,30,32,45,48,50,65,70,72};
		
		obj.algo(arry, 70);
		
		
		
	}
	void algo(int[] arry, int num)
	{
		int lower = 0;
		//higher point (highest value in array)
		int upper = arry.length-1;
		//midindex(mid point of array}
		int mid = (lower+upper)/2;
		
		while(true)
		{
			if(num==arry[mid])
			{
				System.out.println(num+" find at index value "+ mid);
				break;
			}
			else
			{
				if(num>arry[mid])
				{
					lower = mid;
					mid = (lower+upper)/2;
					if(num==arry[mid])
					{
						System.out.println(num+" find at index value "+ mid);
						break;
					}
				}
				else if(num<arry[mid])
				{
					upper = mid;
					mid = (lower+upper)/2;
					if(num==arry[mid])
					{
						System.out.println(num+" find at index value "+ mid);
						break;
					}
				}
			}
		}
		
	}
	
	
}
