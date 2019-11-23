import java.util.Scanner;

public class DLL_Rev {
	Node head;
	static class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			prev=null;
			next=null;
		}
	}
	public void insert(int d)
	{
		Node n =new Node(d);
		if(head==null)
		{
			head=n;
		}
		else
		{
			 Node temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
			n.prev=temp;
		}
		
	}
	public void reverse()
	{
		Node temp = head;
		Node pre=null;
		Node nex=temp.next;
		while(temp.next!=null)
		{
			temp.next=pre;
			temp.prev=nex;
			pre=temp;
			temp=nex;
			nex=temp.next;	
		}
		temp.next=pre;
		temp.prev=nex;
		head=temp;
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
			{System.out.print(temp.data+" ");
			temp=temp.next;
			}
		System.out.println();
	}

	public static void main(String[] args) {

		DLL_Rev r=new DLL_Rev();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no of elements");
	  int n=sc.nextInt();
	  System.out.println("Enter Elements");
	  for(int i=0;i<n;i++)
	  {
		  int j=sc.nextInt();
		  r.insert(j);
	  }
	  System.out.println("Orignal Linked List");
		r.display();
		System.out.println("Reversed Linked List");
		r.reverse();
		r.display();
	}

}
