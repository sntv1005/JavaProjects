package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Sum {

	public static int sumOfMaxMin(Integer[] arr,int n) {
//		Integer [] arr1= new Integer[n];
//		for(int i=0;i<n;i++) {
//			arr1[i]=Integer.valueOf(arr[i]);
//			
//		}
		int min=Collections.min(Arrays.asList(arr));
		int max=Collections.max(Arrays.asList(arr));
		int ans= max-min;
		return ans;
	}
	public static void main(String[] args) {
		
		Integer [ ] arr= {1,2,3,4,5,6,7,81243,1234,1223,123445,223,0};
		int n=arr.length;
	    System.out.println(sumOfMaxMin(arr, n));	
	}
}
