public class mirrorTree {
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
	public static boolean isMirror(Node a,Node b)
	{
		if(a==null&&b==null)
			return true;
		else if(a==null||b==null)
		return false;
		else
		{
			return a.data==b.data&&isMirror(a.left,b.right)&&isMirror(a.right,b.left);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mirrorTree t=new mirrorTree();
		t.root=new Node(1);
		t.root.left=new Node(2);
		t.root.right=new Node(2);
		t.root.left.left=new Node(3);
		t.root.left.right=new Node(4);
		t.root.right.left=new Node(4);
		t.root.right.right=new Node(3);
		System.out.println(isMirror(t.root,t.root));

	}

}
