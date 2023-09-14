package programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr= {1,9,2,8,3,7,4,5,6,7};
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					 temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.println(temp);
		}
		
		
		
	}
}
