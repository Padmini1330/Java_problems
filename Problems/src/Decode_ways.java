import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Decode_ways {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		String s=ob.next();
		numDecodings(s);
	}

	 public static void numDecodings(String s) {
	      
	     
	       StringBuffer b=new StringBuffer();
	       ArrayList<String> str=new ArrayList<String>();
	        for(int i=0;i<=s.length()-1;i++)
	        {
	            b.append(Combination(Character.toString((s.charAt(i)))));
	         
	        }
	       
	        str.add(b.toString());
	        
	        int j=0;
	        for(int i=0;i<=s.length()-2 && j<=s.length()-1;i++)
	        {
	            j=i+1; 
	            String a=Character.toString(s.charAt(i))+Character.toString(s.charAt(j));
	           String m=Combination(a);
	           if(m!=null)
	           str.add(m);
	            
	        }
	        System.out.println(str.size());
	       
	     
	        
	    }
	    public static String Combination(String a)
	    {
	         String res=null;
	         Map<String,String> map=new HashMap<String,String>();
	         map.put("1","A");
	         map.put("2","B");
	         map.put("3","C");
	         map.put("4","D");
	         map.put("5","E");
	         map.put("6","F");
	         map.put("7","G");
	         map.put("8","H");
	         map.put("9","I");
	         map.put("10","J");
	         map.put("11","K");
	         map.put("12","L");
	         map.put("13","M");
	         map.put("14","N");
	         map.put("15","O");
	         map.put("16","P");
	         map.put("17","Q");
	         map.put("18","R");
	         map.put("19","S");
	         map.put("20","T");
	         map.put("21","U");
	         map.put("22","V");
	         map.put("23","W");
	         map.put("24","X");
	         map.put("25","Y");
	         map.put("26","Z");
	        
	        for(Map.Entry<String,String> m : map.entrySet())
	        {
	           if(m.getKey().equals(a))
	           {
	            return m.getValue();   
	           }
	        }
	      return null;
	    }
}
