package Program1;

public class AddMatrices
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int rows=2,columns=3;
        int[][]firstM=new int[][] {{2,3,4},{5,2,3}};
        int[][]secondM=new int[][] {{-4,5,3},{5,6,3}};
        
        int[][]sum=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<columns;j++)
        	{
        		sum[i][j]=firstM[i][j]+secondM[i][j];
        	}
        }
        System.out.println("Sum of two matrices is:");
        for(int[]row:sum)
        {
        	for(int column:row)
        	{
        		System.out.print(column+" ");
        	}
        	System.out.println();
        }
	}

}
