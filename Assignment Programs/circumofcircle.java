package Program1;

import java.util.Scanner;
public class circumofcircle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double r,area,circum;
		double pi=3.14;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=sc.nextInt();
		
		area=3.14*r*r;
		System.out.println("Area of circle:"+area);
		
        circum=2*3.14*r;
        System.out.println("Circumference of circle:"+circum);
	}

}
