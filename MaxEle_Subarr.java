import java.util.Scanner;

public class MaxEle_Subarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter size");
int n=sc.nextInt();
System.out.println("Enter elements");
int arr[]=new int[n];
for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
System.out.println("Enter size of Subarray");
int k=sc.nextInt();
for(int i=0;i<=n-k;i++)
{   int max=arr[i];
	for(int j=0;j<k;j++)
	{ 
		if(arr[j+i]>max)
			max=arr[i+j];
		
	}
	System.out.println(max);
}
	}

}
