import java.util.Scanner;

public class Factorial_trailing_zeroes {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int count=0;
		int n=ob.nextInt();
        int res=fact(n);
        String s=String.valueOf(res);
        app:for(int i=s.length()-1 ; i>=0;i--)
        {//120  0
        	if((s.charAt(i))!= '0') {
        		System.out.print(count);
        		break app;
        	}
        	else {
        		count++;
        	}
        		
        }
        
	}

	private static int fact(int n) {
		
		if(n==0 || n==1)
			return 1;
		else
			return n*fact(n-1);

	}

}
