package Program1;
import java.util.*;
public class areaofrect 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int length;
		int width;
		int area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length:");
		length=s.nextInt();
		System.out.println("Enter the width:");
		width=s.nextInt();
		
		area=length*width;
		System.out.println("Area of rectangle:"+area);
	}

}
