import java.util.Arrays;
import java.util.Scanner;

public class Find_First_and_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=-1,q=-1;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=obj.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("enter the target element");
		int target=obj.nextInt();
		
		Arrays.sort(a);
		app:for(int i=0;i<n;i++)
		{
			if(a[i]==target) 
			{
				p=i;
				for(int j=i+1;j<n;j++)
				{
					if(a[j]==target)
						q=j;
				}
				break app;
		    }
			else {
		    	continue;
		    }
	   }
		if(p==-1&&q==-1)
			System.out.println("No elements found");
		else
			System.out.println(p+" "+q);

     }
}
