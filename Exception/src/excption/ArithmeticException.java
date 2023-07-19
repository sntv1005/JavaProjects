package excption;

public class ArithmeticException {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=a/0;
			System.out.println(b);
			
		}catch(Exception e) {
			System.out.println("Artithmetix exception" +e);
			
		}
		finally {
			System.out.println("it will execute evcen tgere is exception or not ");
		}
	}
}
