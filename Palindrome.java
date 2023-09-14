package programs;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num=12321;
		int rem,rev=0;
		int temp=num;
		
		for(;num!=0;num=num/10) {
			
			rem=num%10;
			rev=(rev*10)+rem;
//			num=num/10;
			
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}

}
