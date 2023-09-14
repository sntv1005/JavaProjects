package programs;

import java.util.Scanner;

public class BinarySearch {
	
	
	
	public static void binarySearch(int[] arr,int frst,int last,int key) {
		
		int mid=(frst+last)/2;
		
		if(frst<last) {
			for(int i=0;i<=arr.length;i++) {
				if(arr[mid]==key) {
					System.out.println("element found at :" +mid);
					break;
				}else if(arr[mid]<key) {
					frst=mid+1;
				}
				else {
					last=mid-1;
				}
				mid=(frst+last)/2;
			}
			if(frst>last) {
				System.out.println("not found ");
			}
		}
	}
public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,60};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to search :");
		
		int key=sc.nextInt();
		int last=arr.length-1;
		
		binarySearch(arr,0,last,key);
	}

}
