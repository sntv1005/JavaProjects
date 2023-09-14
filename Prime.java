package programs;

public class Prime {
	
	public static void main(String[] args) {
		int num=100;
		
		if(num<=1) {
			System.out.println("not a prime ");
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println("not a prime ");
				break;
			}
			else {
				System.out.println("prime");
				break;
			}
		}
		
	}
	

}
