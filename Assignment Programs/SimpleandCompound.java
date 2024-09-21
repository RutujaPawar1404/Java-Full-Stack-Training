package Program1;

import java.util.Scanner;

public class SimpleandCompound
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a,p,n,r,t;
		int si,ci;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		p=sc.nextInt();
		
		System.out.println("Enter the time:");
		n=sc.nextInt();
		
		System.out.println("Enter the rate of interest:");
		r=sc.nextInt();
		
		System.out.println("Enter the time period:");
		t=sc.nextInt();
		
		si=p*r*n/100;
		System.out.println("Simple Interest:"+si);

		ci=p*(1+2/n)*n*t;
		System.out.println("Compound Interest:"+ci);
	}

}
