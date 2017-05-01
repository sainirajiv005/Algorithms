import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaximizingXOR {
	public static void main(String[] args) throws IOException {
		Scanner br = new Scanner(new InputStreamReader(System.in));
        int n = br.nextInt();
        int m = br.nextInt();
        
        int a[][]= new int[n][m];
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		a[i][j]=br.nextInt();
        	}
        }
        
        
        
               
	int maxSum=0,sum=0;

	for(int i=0;i<m;i++)
	{
		int max=kadane(a[i]);
		if(max>maxSum)
			maxSum=max;
	}
	
	for(int j=0;j<m;j++)
	{
		int max=kadaneVertical(a,j,n);
		if(max>maxSum)
			maxSum=max;
	}
	
	System.out.println(maxSum);
	}
	
	
	private static int kadaneVertical(int[][] a, int j,int n) {
		int sum=a[0][j];
		int maxSum=a[0][j];
		for(int i=1;i<n;i++)
		{
			sum=Math.max(a[i][j],sum^a[i][j]);
			maxSum=Math.max(sum, maxSum);
		}
		return maxSum;
	}


	public static int kadane(int a[])
	{
		int sum=a[0];
		int maxSum=a[0];
		for(int i=1;i<a.length;i++)
		{
			sum=Math.max(a[i],sum^a[i]);
			maxSum=Math.max(sum, maxSum);
		}
		return maxSum;
	}


}





/*
		
		Scanner br = new Scanner(new InputStreamReader(System.in));
        int n = br.nextInt();
        int m = br.nextInt();
        
        int a[][]= new int[n][m];
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		a[i][j]=br.nextInt();
        	}
        }
        
        
               
	int maxSum=0,sum=0;
	for(int i=0;i<n;i++)
	{
		sum=a[i][0];
		for(int j=1;j<m;j++)
		{
			sum=sum^a[i][j];
			if(sum>maxSum)
			{
				maxSum=sum;
				break;
			}
		}
		
		if(sum>maxSum)
		{
			maxSum=sum;
		}
		sum=0;
	}
	for(int i=0;i<m;i++)
	{
		sum=a[i][0];
		for(int j=1;j<n;j++)
		{
			sum=sum^a[j][i];
			if(sum>maxSum)
			{
				maxSum=sum;
				break;
			}
		}
		
		if(sum>maxSum)
		{
			maxSum=sum;
		}
	}

	System.out.println(maxSum);
	
	
*/