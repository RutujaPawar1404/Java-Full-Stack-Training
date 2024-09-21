package Program1;
import java.util.*;
public class factorial 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num;
		long fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;			
		}
        System.out.println("Factorial of a number:"+fact);
	}

}
