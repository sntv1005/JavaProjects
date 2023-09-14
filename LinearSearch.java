package programs;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int[] arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("element found at :" +i);
				break;
			}
			else {
					System.out.println("element not found ");
			}
		}
		
	}

	
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,60};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to search :");
		
		int key=sc.nextInt();
		
		linearSearch(arr,key);
	}
}
