import java.util.Scanner;

public class Rotate_CCLL {
  
	static Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next=null;
		}
	}
	
	public static void insert(Rotate_CCLL li , int d)
	{
		Node n = new Node(d);
		if(li.head==null)
		{  
			head=n;
			
		}
		else
		{  Node temp =li.head;
		      while(temp.next!=null )
		      {
		    	  temp = temp.next;
		      }
		      temp.next=n;
		}
		
	}
	public void display(Rotate_CCLL li)
	{

		Node current=li.head;
		System.out.println("The Linked List is as follows:");
		while(current.next!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}
	
	public void Rotate(Rotate_CCLL li,int k)
	{  
		Node temp = li.head;
		for(int i=0;i<k-1;i++)
		{
			temp=temp.next;
		}
Node last=temp.next;
Node curr=li.head;
	  while(curr.next!=null)
	  {
		  curr=curr.next;
	  }
	  curr.next=li.head;
	  head=last;
	  temp.next=null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rotate_CCLL li=new Rotate_CCLL();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		int m;
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			m=sc.nextInt();
		    li.insert(li, m);
		}
		System.out.println("Before Rotation");
		li.display(li);
		System.out.println(" Enter No of Rotations");
		int k=sc.nextInt();
		li.Rotate(li, k);
		System.out.println("After Rotation");
		li.display(li);
		
            
	}

}
