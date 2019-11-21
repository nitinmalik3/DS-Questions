
public class CheckBst {
	
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
static boolean isBST(Node root,Node l,Node r)
{
	if(root==null)
		return true;
	if(l!=null && root.data<=l.data)
	{
		return false;
	}
	if(r!=null && root.data>r.data)
	{
		return false;
	}
	return isBST(root.left,l,root) && isBST(root.right,root,r) ;
}
	public static void main(String[] args) 
	{
		
Node root =new Node(40);
 root.left =new Node(20);
 root.right =new Node(60);
 root.left.left =new Node(10);
 root.left.left.right=new Node(45);
root.left.right =new Node(35);
 root.right.left =new Node(50);
 root.right.right =new Node(70);
root.left.left.left =new Node(5);
//root.left.left.right =new Node(25);
if (isBST(root,null,null))
	System.out.println("isBST");
else
	System.out.println("Not Bst");
	}
	

}
