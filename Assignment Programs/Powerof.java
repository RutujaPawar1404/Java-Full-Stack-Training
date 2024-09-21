package Program1;
import java.util.*;
public class Powerof 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int exp;
        int base;
        int result=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base:");
        base=s.nextInt();
        System.out.println("Enter the exponent:");
        exp=s.nextInt();
        
        while(exp>0)
        {
        	result=result*base;
        	exp=exp-1;
        	//System.out.println("Power of number:"+result);
        }
        System.out.println("Power of number:"+result);
	}

}
