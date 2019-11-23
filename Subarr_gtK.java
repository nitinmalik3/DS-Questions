import java.util.Scanner;

public class Subarr_gtK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max,count=0,k;
		System.out.println("Enter K");
		k=sc.nextInt();
		for(int i=0;i<n;i++)
		{ max=arr[i];
			for(int j=i;j<n;j++)
			{
				if(arr[j]>max)
					max=arr[j];
				if(max>k)
					count++;
			}
		}
		System.out.println(count);
	}

}
