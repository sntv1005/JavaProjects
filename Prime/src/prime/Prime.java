package prime;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check prime:");
		int num=sc.nextInt();
		boolean flag=false;
		
		while(num!=0) {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					flag=true;
					break;

				}
				
			}
			if(!flag) {
				System.out.println("palindrome");
				break;
			}else {
				System.out.println("not a palindrome");
				break;
			}
		}
	
	}

}
