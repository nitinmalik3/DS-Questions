import java.util.Scanner;

public class RmvAdjDup {

	public static String RemoveDup(String s)
	{
		if(s.length()<=1)
			return s;
		if(s.charAt(0)==s.charAt(1))
		{ int i;
			for(i=0;i<s.length()-1;i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
					continue;
				else
					break;
			}
			return RemoveDup(s.substring(i+1));
		}
		else
			return s.charAt(0)+RemoveDup(s.substring(1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1=RemoveDup(s);
System.out.println(s1);
	}

}
