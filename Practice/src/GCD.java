
public class GCD 
{
	public static void main(String[] args) 
	{
		int a=56,b=12,c=0;
		do
		{
			c=a%b;
			if(c!=0)
			{
			a=b;
			b=c;
			}
		}while(c!=0);
		System.out.println(b);
		
	}

}
