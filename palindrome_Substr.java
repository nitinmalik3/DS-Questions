import java.util.Scanner;

public class palindrome_Substr {
	public static boolean isPalindrome(String s1)
	{ int f=0;
		for(int i=0,j=s1.length()-1;i<j;)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{	f=1;
			}
			else
				{
				f=0;
				break;
				}
			i++;
			j--;
		}
		if(f==1)
			return true;
		else
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=new String();
String s1=new String();
String s2=new String();
s=sc.next();
int max=0;
for(int i=0;i<s.length();i++)
{
	for(int j=i+1;j<=s.length();j++)
	{
		s1=s.substring(i,j);
		
		if(isPalindrome(s1))
		{
			int n=s1.length();
			if(n>max)
			{
				s2=s1;
				max=n;
			}
			
		}
			
		
	}
}
System.out.println(s2);


		
		
		
		

	}

}
