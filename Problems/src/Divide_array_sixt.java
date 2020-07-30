import java.util.Scanner;

public class Divide_array_sixt {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	b[i]=ob.nextInt();
        }
        int val = compute(a,b);
        if(val>-1)
        System.out.println("Fair "+val);
        else
        	System.out.println("Not fair");
	}

	private static int compute(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int res1=0,res2=0,res3=0,res4=0,j=-2,k=-1;
		for(int i=1;i<a.length;i++)
		{
			res1=divide(a,0,i);
			res2=divide(a,i+1,a.length-1);
			if(res1==res2)
				j=i;
		}
		for(int i=1;i<b.length;i++)
		{
			res3=divide(b,0,i);
			res4=divide(b,i+1,b.length-1);
			if(res3==res4)
				k=i;
		}
		if(j==k)
		{
			return j;
		}
		else {
			return -1;
		}
	
	}

	private static int divide(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=low;i<=high;i++)
		{
			res+=a[i];
		}
		return res;
	}

}
