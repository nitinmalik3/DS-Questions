import java.util.Scanner;
public class merge_sortedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1 array");
		int n=sc.nextInt();
		System.out.println("Enter array Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter size of 2 array");
		int m=sc.nextInt();
		System.out.println("Enter array Elements");
		int arr1[]=new int[m];
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		int arr2[]=new int[n+m];
		int i=0,j=0,k=0;
		while(i<n&&j<m)
		{
			if(arr[i]<arr1[j])
			arr2[k++]=arr[i++];
			else
				arr2[k++]=arr1[j++];
		}
		while(i<n)
			arr2[k++]=arr[i++];
		while(j<m)
		arr2[k++]=arr1[j++];
		
		for(int h=0;h<n+m;h++)
			System.out.print(arr2[h]+" ");

	}

}
