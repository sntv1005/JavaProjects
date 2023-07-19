package stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers{

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,12,13,12,14,13,15,19,24,22,22,30);
		list.stream().filter(a->a%2==0).forEach(System.out::println);
		
	}
}
