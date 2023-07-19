package stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicateelements {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,13,21,10,13,23,43,12,123);
		Set<Integer> set= new HashSet<>();
		list.stream().filter(x->!set.add(x)).forEach(System.out::println);
	}

}
