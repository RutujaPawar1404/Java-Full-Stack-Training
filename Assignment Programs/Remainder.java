package Program1;
import java.util.*;
public class Remainder 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int rem=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=s.nextInt();
		
		System.out.println("Enter the second number:");
		num2=s.nextInt();
		
        rem=num1-(num1/num2)*num2;
        System.out.println("Remainder is:"+rem);
	}

}
