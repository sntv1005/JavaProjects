package programs;

import java.util.Arrays;

public class Largest {
	
	public static void main(String[] args) {
		
		int[] arr= {34,56,23,456,234,2556,2343,533};
		int largest=0;
		int secondLargest=0;
		int total=arr.length-1;
		
		
		Arrays.sort(arr);
		
		System.out.println("Largest number is :"+arr[total]);
		System.out.println("second Largest number is :"+arr[total-1]);
		
		System.out.println("third Largest number is :"+arr[total-2]);
		System.out.println("minimum number is :"+arr[0]);
		
		
		
//		for(int i=0;i<=arr.length-1;i++) {
//			if(arr[i]>largest) {
//				secondLargest=largest;
//				largest=arr[i];
//			
//			}
//			
//		}
//		System.out.println("Largest number of array is :"+largest );
//		System.out.println("Second Larget number is :" +secondLargest);
	}

}
