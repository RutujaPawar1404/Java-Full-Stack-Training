package Program1;
import java.util.*;
public class Swap 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x;
		int y;
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter the value of x:");
	    x=s.nextInt();
	    System.out.println("Enter the value of y:");
	    y=s.nextInt();
	    
	    x=x+y;
	    y=x-y;
	    x=x-y;
	    
	    System.out.println("After swapping:"+x+" "+y);
	}

}
