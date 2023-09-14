package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
	
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Srinath","madhu","ammu");
		
		list.stream().forEach(System.out::println);
		
		long count = list.stream().count();
		System.out.println(count);
		List<String> collect = list.stream().filter(a->a.startsWith("M")).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<Integer> li= Arrays.asList(14,5,4,15,6,2,3,1,14,4,15,13);
		List<Integer> l= Arrays.asList(1,2,4);
		
		Integer integer = li.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer);
		
		Integer integer2 = li.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer2);
		
		
		List<String> collect2 = list.stream().filter(a->a.length()>3).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = li.stream().map(a->a*3).collect(Collectors.toList());
		System.out.println(collect3);
		
		Stream.concat(li.stream(), l.stream()).forEach(System.out::print);
		
		Set<Integer> set= new HashSet<>(li);
		System.out.println("After removinf :"+set);
		
		
		Set<Integer> collect4 = li.stream().filter(a->!set.add(a)).collect(Collectors.toSet());
		System.out.println(collect4);
		
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalDateTime.now());
		
//		li.stream().sorted().forEach(System.out::print);
//		li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
//		li.stream().filter(a->a%2==0).forEach(System.out::print);
		
//		li.stream().map(a->a+ "").filter(a->a.startsWith("1")).forEach(System.out::print);
		
//		li.stream().filter(a->!set.add(a)).forEach(System.out::println);
		
//		li.stream().findFirst().ifPresent(System.out::print);
		
		long count2 = li.stream().count();
//		System.out.println(count2);
		
		Integer integer3 = li.stream().max((Integer::compare)).get();
		System.out.println(integer3);
		
		
	}

}
