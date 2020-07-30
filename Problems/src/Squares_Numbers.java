import java.util.Scanner;

public class Squares_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		try{compute(n);}catch(Exception e) {e.printStackTrace();}
	}

	private static void compute(int n) throws Exception{
		// TODO Auto-generated method stub
		int ans=0;
	    while(n!=0)
	    {
	    	int v=n%10;
	    	ans+=Math.pow(v,2);
	    	n=n/10;	  
	    }
		if (ans==1) {
			System.out.println("true");
		}
		else {
			
			compute(ans);
		}
	}

}
// input 122   122    2
//output:9   n%10=2,2,1
//n=n/10=12,1,0