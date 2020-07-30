import java.util.Arrays;
import java.util.Scanner;

public class Digit_pairs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++) {
			str[i]=s.next();
		}
		int res=compute(n,str);
		System.out.println(res);

	}

	private static int compute(int n, String[] str) {
		String a[]=new String[3];
		int b[]=new int[3];
		int d[]=new int[n];
		int count=0;
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<a.length-1;j++)
	    	{
	    		a[j]=Character.toString(str[i].charAt(j));
	    	}
	    
	    	for(int k=0;k<3;k++)
	    	{
	    		b[k]=Integer.valueOf(a[i]);
	    	}
	    	Arrays.sort(b);
	    	int min=b[0];

	    	int max=b[b.length-1];
	    	
	    	d[i]=(max*11)+(min*7);
	    }
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(d[i]+" ");
	    }
	    
	    for(int i=0;i<n;i=i+2){
	    
	    }
	    
		return 0;
	}

}
