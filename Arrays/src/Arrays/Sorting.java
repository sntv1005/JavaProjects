package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	
	public static void main(String[] args) {
		
		Integer[] arr= {1,4,8,9,0,123,456,234,321,2354};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		Integer[] arr1= {1,3,5,6,5,7,8,92,3,4,5};
		Arrays.sort(arr,4,8);
		for(int i=0;i<11;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
