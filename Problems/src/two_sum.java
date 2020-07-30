import java.util.Scanner;

public class two_sum {

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
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((a[i]+a[j])==target)
				{
					p=i;
					q=j;
				}
			}
		}
		if(p==-1 && q==-1) 
			System.out.println("no element matches the target");
		else
			System.out.println("["+p+","+q+"]");
	}

}
