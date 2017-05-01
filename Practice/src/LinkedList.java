
public class LinkedList 
{
	static Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	
	public Node reverse(Node head, int k)
	{
		Node curr=head, nextNode=null, prev=null;
		int count=0;
		
		while(count<k && curr!=null)
		{
			nextNode=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nextNode;
			count++;
		}
		if(nextNode!=null)
			head.next=reverse(nextNode,k);
		return prev;
			
	}
	
	public void push(int data)
	{
		Node node = new Node(data);
		node.next=head;
		head=node;
		
	}
	
	public static void print()
	{
		Node curr= head;
		while(curr!=null && curr.next!=null)
		{
			System.out.print(curr.data + "->");
			curr=curr.next;
		}
		System.out.println(curr.data+"\n\n");
	}
	
	
	
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.push(9);
		list.push(8);
		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(2);
		list.push(1);
		System.out.println("Before Reversing");
		print();
		list.head=new LinkedList().reverse(list.head,4);
		System.out.println("After Reversing");
		print();
		
		
	}
	
	}

