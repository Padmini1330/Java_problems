import java.util.Scanner;

public class Rotate_image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
		        a[i][j]=s.nextInt();
		
		s.close();
		
		rotate(a);

	}

	private static void rotate(int[][] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		int k,l=0;
		int b[][] = new int[len][len];
		for(int i=len-1;i>=0;i--)
		{
			k=0;
			for(int j=0;j<len && k<3 && l<3;j++)
			{
			     b[k][l]=a[i][j];
			     k++;
			     if(k>2)
			    	 l++;
	        }
		}
		for(int c[]:b) {
			for( int d : c) {
				System.out.print(d + " ");
			}
		System.out.println();
	}
		
	}

} 
	
