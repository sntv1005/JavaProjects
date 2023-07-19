package patters;

public class Rhombus {
	
	public static void main(String[] args) {
		
		int n=6;
		printPattern(n);
	}

	private static void printPattern(int n) {

		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}

}
