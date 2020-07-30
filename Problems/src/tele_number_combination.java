import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class tele_number_combination {

	public static List<String> ArrCombination(String n,String m)
	{
		ArrayList<String> str=new ArrayList<String>();
		Map<String,String> list = new HashMap<>();		
		list.put("2","abc");
		list.put("3","def");
		list.put("4","ghi");
		list.put("5","jkl");
		list.put("6","mno");
		list.put("7","pqrs");
		list.put("8","tuv");
		list.put("9","wxyz");
		String p="";
		String q="";
		for(Map.Entry l : list.entrySet())
		{
			String x=(String)l.getKey();
			if(n.equals(x))
			{
				p=(String)l.getValue();
			}
		}
		for(Map.Entry w : list.entrySet())
		{
			String y=(String)w.getKey();
			if(m.equals(y))
			{
				q=(String)w.getValue();
			}
		}
		
		for(int i=0;i<p.length();i++)
		{
			for(int j=0;j<q.length();j++)
			{
				String res = Character.toString(p.charAt(i))+Character.toString(q.charAt(j));
				 str.add(res);
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a two-digit number");
		String number=obj.next();
		List<String> result=ArrCombination(Character.toString(number.charAt(0)),Character.toString(number.charAt(1)));
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i)+"\t");
		}
				

	}

}
