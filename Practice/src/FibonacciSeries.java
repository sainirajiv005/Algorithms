import java.util.HashMap;

public class FibonacciSeries 
{
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	static int x=0;
	public static void main(String[] args) 
	{
		System.out.println(new FibonacciSeries().calculate(4));
		
		
	}
	

	private long calculate(long n) 
	{
		long f;
		if(map.containsKey(n))
			return map.get(n);
		if(n<2)
			return 1;
		else
		{
			
			f = calculate(n-1)+calculate(n-2);
			System.out.println(x+"\t\t"+f);
			x++;
		}
		return f;
	}

}
