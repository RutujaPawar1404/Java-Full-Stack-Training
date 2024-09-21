package Program1;
import java.util.*;
public class palindrome 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,dig;
		int temp = n;
		int rev=0;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    n=s.nextInt();
	    while(n>0)
	    {
	    	dig=n%10;
	    	rev=rev*10+dig;
	    	n=n/10;
	    	
	    }
	    if(temp==rev)
    	{
    		System.out.println("Number is palindrome:");
    	}
    	else
    	{
    		System.out.println("Number is not palindrome:");
    	}
		

	}

}
