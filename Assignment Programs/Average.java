package Program1;
import java.util.*;
public class Average 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int num;
        double avg=0;
        int[] arr=new int[6];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        num=s.nextInt();
        
        for(int i=0;i<num;i++)
        {
        	arr[i]=s.nextInt();
        }
        for(int i=0;i<num;i++)
        {
        	avg=avg+arr[i];
        }
        avg=avg/num;
        System.out.println("Average of given numbers:"+avg);
	}

}
