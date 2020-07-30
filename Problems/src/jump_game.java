import java.util.Scanner;

public class jump_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		boolean res= jump(a,n);
		System.out.println(res);

	}

	private static boolean jump(int[] a, int n) {
		// TODO Auto-generated method stub
		int temp=0,val,k;
		boolean flag = false;
		val=n-1;
		app:for(int i=0;i<n;i++)
		{
		  temp=a[i];
		 
		  k=i;
		  for(int j=1;j<=temp;j++)
		  {
			  k++;
		  }
			if(k==val)
			{
				flag =true;
				break app;
			}
		}
		return flag;
	}

}
