import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class plus_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		List<Integer> list = compute(a);
		Iterator it =list.iterator();
		while(it.hasNext()) {
			System.out.print((int)it.next() );
		if((it.hasNext()))
			System.out.print(",");
		}
	}

	private static List<Integer> compute(int[] a) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		int len = a.length;
		StringBuffer b = new StringBuffer();
		for(int i=0;i<len;i++) {
			b.append(String.valueOf(a[i]));
		}
		String v = b.toString();
		int val = Integer.parseInt(v);
		val = val+1;
		String res = String.valueOf(val);
		for(int i=0;i<res.length();i++)
		{
			String n = String.valueOf(res.charAt(i));
			l.add(Integer.parseInt(n));
		}
		
		
		
		
		return l;
	}

}
