package Program1;
import java.util.*;
public class gradesofstud 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int marks;      
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        marks=s.nextInt();
        String grade;
        if(marks>=90 && marks<=100)
        {
        	grade="A";
        }
        else if(marks>=80 && marks<90)
        {
        	grade="B";
        }
        else if(marks>=70 && marks<80)
        {
        	grade="C";
        }
        else if(marks>=60 && marks<70)
        {
        	grade="D";
        }
        else if(marks>=50 && marks<60)
        {
        	grade="E";
        }
        else if(marks>=40 && marks<50)
        {
        	grade="Poor";
        }
        else
        {
        	System.out.println("F");
        }
        System.out.println("The grade for the student:" +grade);
	} 
	  

}
