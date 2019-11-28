import java.util.Scanner;
public class lca {
	  public static Node root;
	    static class Node
	    {
	        int data;
	        Node left;
	        Node right;
	        Node(int data)
	        {
	            this.data=data;
	        }
	    }
	    lca()
	    {
	        root=null;
	    }
	    lca(int data)
	    {
	        root=new Node(data);
	    }
	    public static Node lowestCommonAncestor(Node root,int x,int y)
	    {
	        if(root==null||root.data==x||root.data==y)
	            return root;
	        Node left= lowestCommonAncestor(root.left,x,y);
	        Node right= lowestCommonAncestor(root.right,x,y);
	        if(left!=null && right!=null)
	            return root;
	        if(left!=null)
	            return left;
	        if(right!=null)
	            return right;
	        return null;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        lca t1=new lca(1);
        t1.root.left=new Node(2);
        t1.root.right=new Node(3);
        t1.root.left.left=new Node(4);
        t1.root.left.right=new Node(5);
        t1.root.right.left=new Node(6);
        t1.root.right.right=new Node(7);
        System.out.println("Enter Nodes");
        int a1=obj.nextInt();
        int b1=obj.nextInt();
        Node n1=t1.lowestCommonAncestor(t1.root,a1,b1);
        System.out.println("LCA of ("+a1 +", "+b1+")->"+n1.data);
	}

}
