import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excelsheet_col_no {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		s=s.toUpperCase();
		int sum=0,j=1;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(i==s.length()-1) 
				sum = Compute(Character.toString(s.charAt(i)));
			else 
				{
				sum+=(26*j*Compute(Character.toString(s.charAt(i))));
				j++;	
				}
			
		}
        System.out.println(sum);
        
	}

	private static int Compute(String s) {
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("A",1);
        map.put("B",2);
        map.put("c",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.put("G",7);
        map.put("H",8);
        map.put("I",9);
        map.put("J",10);
        map.put("K",11);
        map.put("L",12);
        map.put("M",13);
        map.put("N",14);
        map.put("O",15);
        map.put("P",16);
        map.put("Q",17);
        map.put("R",18);
        map.put("S",19);
        map.put("T",20);
        map.put("U",21);
        map.put("V",22);
        map.put("W",23);
        map.put("X",24);
        map.put("Y",25);
        map.put("Z",26);
       
       for(Map.Entry<String,Integer> m : map.entrySet())
       {
          if(m.getKey().equals(s))
          {
           return m.getValue();   
          }
       }
		
		
		
		return 0;
		
	}

}
