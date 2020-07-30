
import java.util.*;

public class Subset_arrays {

	public static void main(String[] agrs)
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elts");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		int result= Maxsum(n,a);
		System.out.println("Max Sum is "+result);
	}

	private static int Maxsum(int n, int[] a) {
		// TODO Auto-generated method stub
		
	    int sum=0;
		int totalsum=0;
		int flag;
		
		if(n<1)
			return 0;
		else
		{
			for(int i=0;i<n;i++)
			{
				 
				for(int j=i+1;j<n;j++)
				{
				  String p=String.valueOf(a[i]);
				  String q=String.valueOf(a[j]);
				  flag=0;
				  for(int k=0;k<p.length();k++)
				  {
					  for(int m=0;m<q.length();m++)
					  {
						  if(p.charAt(k)==q.charAt(m))
						  {
							 flag=1;					  
						  }
						
					  }
				  }	
				 			  
				  
				  if(flag==0)
				  {
					//  System.out.println(totalsum);
					  sum=Integer.parseInt(p)+Integer.parseInt(q);
					  if(sum >= totalsum)
				         totalsum=sum;
				  }
				}
			}
		}
		
			
			
			
		return totalsum;
			
	}

}
