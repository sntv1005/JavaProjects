package patters;

public class DiamondStar {
	public static void main(String[] args) {
		int n=10;
		printPattern(n);
	}

	private static void printPattern(int n) {

		for (int i=0;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
			System.out.print( " *");
		}
			System.out.println(" ");
		}
		for (int i=0;i<=n;i++) {
			for(int j=n-i;j>=0;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
