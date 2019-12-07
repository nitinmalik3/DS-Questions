public class printLeaf {
static Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
		
	}
	
	public static void printLeaf(Node r)
	{
		if(r==null)
			return;
		else if(r.left==null&&r.right==null)
		{
			System.out.print(r.data+" ");
			return;
		}
		
			printLeaf(r.left);
			printLeaf(r.right);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLeaf t=new printLeaf();
		t.root=new Node(1);
		t.root.left=new Node(2);
		t.root.right=new Node(2);
		t.root.left.left=new Node(3);
		t.root.left.right=new Node(4);
		t.root.right.left=new Node(4);
		t.root.right.right=new Node(3);
		t.root.right.right.right=new Node(6);
		
	printLeaf(t.root);

	}

}
