package Program1;
import java.util.*;
public class sumof2D
{
   
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        cal();
	}
     public static void cal()
     {
    	 int num[][]=new int[2][2];
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter number:");
         for(int i=0;i<2;i++)
         {
        	 for(int j=0;j<2;j++)
        	 {
        		num[i][j]=s.nextInt();
        	 }
         }
         for(int i=0;i<2;i++)
         {
             for(int j=0;j<2;j++)
             {
            	System.out.print(num[i][j]+" ");
             }
             System.out.println();
          }
       }
 }
 
