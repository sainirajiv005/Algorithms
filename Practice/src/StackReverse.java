import java.util.ArrayList;
import java.util.Stack;

public class StackReverse 
{
	
	public void reverse(Stack<Integer> stack)
	{
		if(stack.isEmpty())
			return;
		int temp =stack.pop();
		reverse(stack);
		sortStack(stack,temp);
	}
	
	private void sortStack(Stack<Integer> stack, int data) 
	{
		if(stack.isEmpty())
		{
			stack.push(data);
			return;
		}
		else
		{
			int temp = stack.pop();
			sortStack(stack,data);
			stack.push(temp);
			
			
		}
		
	}

	public static void main(String[] args) 
	{
		Stack<Integer> stack =new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		
		
		new StackReverse().reverse(stack);
		System.out.println("Reversed Stack");
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}
}
