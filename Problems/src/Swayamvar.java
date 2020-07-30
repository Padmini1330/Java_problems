import java.util.Scanner;

public class Swayamvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      char bride[] = new char[n];
      char groom[] = new char[n];
      for(int i=0;i<n;i++)
      {
    	  bride[i]= s.next().charAt(0);
      }
      for(int i=0;i<n;i++)
      {
    	  groom[i]= s.next().charAt(0);
      }
      int res=compute(n,bride,groom);
      System.out.println(res);
	}

	private static int compute(int n,char[] bride,char[] groom) {
		// TODO Auto-generated method stub
		char ch = bride[0];
		int count=0,c=0;
		int j=0;
		for(int i=0;i<groom.length;i++)
		{
			if(ch!=groom[i])
			{
				count++;
			}
		}
		if(count==n) return  n;
		
		for(int i=0;i<bride.length;i++)
		{
		    for(int m=0;m<groom.length;m++)
			{
				j=0;
				if(bride[i]==groom[j])
				{
					bride[i] = 'a';
					groom[j] = 'a';
					
				}
				else if(bride[i]!=groom[j])
				{
					int k=0;
					char temp = groom[j];
					for(k=0;k<groom.length-1;k++)
					{
						groom[k]=groom[k+1];
					}
					groom[k]=temp;
					for(int l=0;l<groom.length;l++)//hello??
	
					{
							System.out.print(groom[l]+" ");
					}
					System.out.println();
				
				}
				
			}
		}
		
		for(int i=0;i<groom.length;i++)
		{
			if(groom[i]!='a')
			c++;
		}
		return c;
	}

}





