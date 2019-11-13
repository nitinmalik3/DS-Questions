import java.util.Scanner;

public class SubarrWithsumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int count;
		for(int i=0;i<n;i++)
		{ 
			count=0;
			for(int j=i;j<n;j++)
			{
				count=count+arr[j];
				if(count==k)
				{
					System.out.println("Statring index:"+i+" ,Ending index:"+j);
				}
				if(count>k)
					break;
			}
		}
		

	}

}
