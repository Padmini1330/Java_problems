import java.util.Scanner;

public class Rotate_Array {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Enter the value for rotation");
		int rot = s.nextInt();
		int b[] = compute(a,n,rot);
		for(int c:b)
			System.out.print(c+" ");
	}

	private static int[] compute(int[] a, int n,int r) {
		int temp=0;
		int i;
		while(r!=0)
		{
		for(i=(n-1);i>0;i--)
		{
			if(i==n-1) {
			 temp=a[i];
			}
			a[i]=a[i-1];
		
		}
		a[i]=temp;
		
	    r--;
		}
		return a;
	}
}
