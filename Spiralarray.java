import java.util.Scanner;

public class Spiralarray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	             
         int arr[][]=new int[n][n];
         for(int i=0;i<n;i++)
         {
        	 for(int j=0;j<n;j++)
        	 {
        		 arr[i][j]=sc.nextInt();
        	 }
         }
         int r=0,c=0;
         int r1=n,c1=n;
         while(r<r1&&c<c1)
         {for(int i=c;i<c1;i++)
         {
        	 System.out.print(arr[r][i]+" ");
         }
         r++;
       
         for(int i=r;i<r1;i++)
         {
        	 System.out.print(arr[i][c1-1]+" ");
         }
           c1--;
         
         for(int i=c1-1;i>=c;i--)
         {
        	 System.out.print(arr[r1-1][i]+" ");
         }
          r1--;
         
         for(int i=r1-1;i>=r;i--)
         {
        	 System.out.print(arr[i][c]+" ");
         }
         c++;
         
    
         }
	}

}