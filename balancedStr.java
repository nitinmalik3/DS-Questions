import java.util.*;

public class balancedStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<Character>();
		String c=new String();
		Scanner sc=new Scanner(System.in);
		c=sc.next();
		int g=0;
		for(int i=0;i<c.length();i++)
		{
			if(c.charAt(i)=='('||c.charAt(i)=='['||c.charAt(i)=='{')
			{
				s.push(c.charAt(i));
			}
			else if(c.charAt(i)==')')
			{
				char ch=s.pop();
						if(ch!='(')
							{g=1;
							break;
							}
			}
			else if(c.charAt(i)=='}')
			{
				char ch=s.pop();
						if(ch!='{')
							{g=1;
							break;
							}
			}
			else if(c.charAt(i)==']')
			{
				char ch=s.pop();
						if(ch!='[')
							{g=1;
							break;
							}
			}
		}
		if(g==0 && s.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		

	}

}
