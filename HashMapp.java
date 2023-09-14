package programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {
	
	public static void main(String[] args) {
		
		String str = "Madhu Srinath Ammu Chinni";
		String[] spl= str.split(" ");
		
		Map<Character,Integer> map= new HashMap<>();
		Map<String,Integer> hm= new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++) {
			if(map.containsKey(str.charAt(i))) {
				int count =map.get(str.charAt(i));
				map.put(str.charAt(i), count+1);
				
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println("each character is :"+map);
		
		 for (String word : spl) {
	            // containsKey(key) will return a boolean value
	            // i.e. true if it contains the key and false if
	            // it doesn't.
	            if (hm.containsKey(word))
	                hm.put(word, hm.get(word) + 1);
	 
	            else
	                hm.put(word, 1);
	        }
	 
//		for(int i=0;i<=spl.length;i++) {
//			if(hm.containsKey(spl[1])) {
//				int count= hm.get(spl[i]);
//				hm.put(spl[i], count+1);
//			}else {
//				hm.put(spl[i], 1);
//			}
//		}
		System.out.println("each word is :"+hm);
		
	}

}
