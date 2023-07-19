package swap;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers A and B to swap :");
		int A=sc.nextInt();
		int B=sc.nextInt();
		int temp;
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		
//		temp=A;
//		A=B;
//		B=temp;
//		
		System.out.print("After swapping Ais :" +A+" and B is :" +B);
		
	}

}
