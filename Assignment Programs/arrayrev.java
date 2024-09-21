package Program1;

public class arrayrev
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] x=new int[] {1,2,3,4,5};
		System.out.println("Original Array:");
	    for(int i=0;i<x.length;i++)
	    {
	      	System.out.println(x[i]+" ");
	    }
	    System.out.println("Elements after the reverse of array:");
		for(int i=x.length-1;i<=5;i--)
		{
			System.out.println(x[i]);
		}

	}

}
