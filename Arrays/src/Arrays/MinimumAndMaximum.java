package Arrays;

import java.util.*;
import java.util.Collections;

public class MinimumAndMaximum{

	public static void main(String[] args) {
		Integer [] arr= {1,2,3,4,5};
		int min= Collections.min(Arrays.asList(arr));
		System.out.println(min);
		
		String[] str= {"Srinath", "Madhu"," Ammu","Bangari"};
		String mn=Collections.min(Arrays.asList(str));
		System.out.println(mn);
		
		Integer [] ar= {1,4,6,8,9,5};
		int max= Collections.max(Arrays.asList(ar));
		System.out.println(max);
		
		}
		
		
	}


