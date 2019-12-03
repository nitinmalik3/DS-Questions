import java.util.HashMap;
import java.util.Scanner;

public class phoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Enteries");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Name:");
			String name=sc.nextLine();
			System.out.println("Phone number:");
			String no=sc.nextLine();
			h.put(name, no);
		}
		
		while(sc.hasNext())
		{
			String name=sc.nextLine();
			if(h.get(name)!=null)
			{
				System.out.println(name+" = "+h.get(name));
			}
			else
			{
				System.out.println("Not found");
			}
		}

}
}
