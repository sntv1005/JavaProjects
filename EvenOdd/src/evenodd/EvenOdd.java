package evenodd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check even or odd :");
		int num=sc.nextInt();
//		int year= sc.nextInt();
		
//		if(num%2==0) {
//			System.out.println("the "+num+ "is even");
//		}else {
//			System.out.println("the "+num+ "is odd");	
//		}
		
//		if(year %4==0 || year %400==0) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("ordinary year");
//		}
		
		if(num<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("positive");
		}
		
		
	}

	
	
	}
