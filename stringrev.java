import java.util.Scanner;

public class stringrev {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
String s=new String();
s=sc.next();
char [] ch=new char[s.length()];
ch=s.toCharArray();
int n=s.length()-1;
for(int i=0,j=n;i<j;)
{


	if(ch[i]<65||(ch[i]>92&&ch[i]<97)||ch[i]>122)
	{
		
		i++;
		continue;
	}
	if(ch[j]<65||(ch[j]>92&&ch[j]<97)||ch[j]>122)
	{
		j--;
		continue;
	}
	char temp;
	temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	i++;
	j--;
}
String s1=new String(ch);
System.out.println(s1);

	}

}