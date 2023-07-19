package Link;

import java.util.HashMap;
import java.util.LinkedList;

public class Linked { 
	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList();
		ll.add("Srinath");
		ll.add("Madhu");
		ll.add("Ammu");
		ll.add("Srinath");
		System.out.println(ll);
		
		for(int i=0;i<ll.size();i++) {
			System.out.println("String is :"+ll.get(i));
		}
		HashMap<Integer,String>map=new HashMap();
		map.put(1, "aa");
		map.put(0, "aa ");
		map.put(null, "aa ");
		map.put(0, "aa ");
		map.put(2, "A");
		map.put(null, "aa ");
		map.put(122, "A");
		map.put(1222, "A");
		System.out.println(map);
		
	
		
	}

}
