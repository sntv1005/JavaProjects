package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberStartingwithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,16,19,15,17,19,20,35,48);
//	find number strats with 1
//		list.stream().map(a->a + " ").filter(a->a.startsWith("1")).forEach(System.out::println);

		//	 find first elemenmt 
//		list.stream().findFirst().ifPresent(System.out::println);
//		long count = list.stream().count();
//		System.out.println(count);
		Integer max = list.stream().max(Integer :: compare).get();
		System.out.println(max);
		
		String str= "Madhu i love you ammu ";

		 Character result = str.chars() // Stream of String       
		            .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
		            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
		            .entrySet()
		            .stream()
		            .filter(entry -> entry.getValue() == 1L)
		            .map(entry -> entry.getKey())
		            .findFirst()
		            .get();
		 System.out.println(result);
		 Character result1 = str.chars() // Stream of String       
                 .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                 .entrySet()
                 .stream()
                 .filter(entry -> entry.getValue() > 1L)
                 .map(entry -> entry.getKey())
                 .findFirst()
                 .get();
System.out.println(result1);
	}
}
