import java.util.Scanner;

public class PairsWith_sumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n,m,k;
		System.out.println("Enter size of first array");
		n=sc.nextInt();
		System.out.println("Enter size of second array");
		m=sc.nextInt();
		System.out.println("Enter value of k");
		k=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("Enter array1 elements");
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter arr2 elements");
		for(int j=0;j<m;j++)
			arr2[j]=sc.nextInt();
		
		int max=arr2[0];
		
		for(int i=1;i<m;i++)
		{
			if(arr2[i]>max)
				max=arr2[i];
		}
		
		
		int arr3[]=new int[max+1];
		
		
		
		for(int i=0;i<m;i++)
		{
			arr3[arr2[i]]=1;
		}
		
		
System.out.println("Following are the pairs with sum k");	


         for(int i=0;i<n;i++)
         { 
        	 int g=arr1[i]-k;
        	 if(g<0)
        		 g=-1*g;
        	 if(arr3[g]==1)
        	 {
        		 System.out.println(arr1[i]+" "+g);
        	 }
        	 
         }
	}

}
