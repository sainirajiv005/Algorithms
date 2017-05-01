/*
 * Return product of array at index i leaving ith element 
 * */
public class ProductOfArrElement {
	
	public static void main(String[] args) {
	
		int arr[] = {6,2,3,4,5};
		System.out.print("Original Array: \t");
		printResult(arr);
		int result[]=new ProductOfArrElement().findProduct(arr);
		
		System.out.println();
		System.out.print("Final Result:\t\t");
		printResult(result);
		
	}

	private static void printResult(int[] result) {
		for(int i =0 ;i<result.length;i++)
		{
			System.out.print(result[i]+"\t");
		}
	}

	private int[] findProduct(int[] arr) 
	{
		int [] temp = new int[arr.length];
		intitializingArr(temp);
		int leftProd=arr[0];
		for(int i =1;i<arr.length;i++)
		{
			temp[i]=leftProd;
			leftProd*=arr[i];
		}
		System.out.print("\nAfter LeftProd Loop");
		printResult(temp);
		int rightProd=1;
		for(int j=arr.length-2;j>=0;j--)
		{
			rightProd*=arr[j+1];
			temp[j]=temp[j]*rightProd;
			
		}
		return temp;
	}

	private void intitializingArr(int[] temp) 
	{
		for(int i =0;i<temp.length;i++)
		{
			temp[i]=1;
		}
		
	}
}
