package programs;

import java.util.Random;

public class Randomnumbers {
	
	public static void main(String[] args) {
		
//		int ran= (int) (Math.random()*100);
//		System.out.println(ran);

		Random ran=new Random();
		ran.ints().limit(10).forEach(System.out::print);
	}

}
