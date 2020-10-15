package com.github.avinashkris9.learn.programming.misc;

//
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.


public class PalindromeNumber {

	//function to find reverse of a number;
	public static int reverse(int n)
	{
		int sum=0;
		int l=0;
		while(n>0)
		{
			l=n%10;
			sum=sum*10 +l;
			n=n/10;
		}
		return sum;
	}



	public static void main(String[] args)

	{
		int product=0;

		 int l=0;
		 int s=0;
		 int larger=0;
		for (int i=101;i<=999;i++)
		{
			for (int j=i;j<=999;j++)
			{
				 product=i*j;
				s =product;

				if(s==reverse(product))
					{
						if(s>larger)
						{
							larger=s;
						}
					}

			}

		}
		System.out.println(larger);
	}

}