

public class MaximumSumArray 
{
	int minInd=0,maxInd=0;
	public int kadane(int a[])
	{
		int sum=a[0];
		int maxSum=a[0];
		for(int i=1;i<a.length;i++)
		{
			sum=Math.max(a[i],sum+a[i]);
			maxSum=Math.max(sum, maxSum);
			System.out.println(i +"\tSum : "+sum+"\tMaxSum :"+maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) 
	{
		int arr[]= {  1, 2, -2, -1, 2, 7, -2, 3};
		MaximumSumArray obj = new MaximumSumArray();
		int result=obj.kadane(arr);
		System.out.println(result);
		
	}
}
