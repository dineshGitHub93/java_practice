package java_practice.collections.Predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		Predicate<Integer> isEven= n -> n%2==0;
		
		List<Integer> evenNumbers = numbers.stream().filter(isEven)
						.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		Predicate<Integer> isODD = n -> n%2==1;
		
		List<Integer> oddNumbers = numbers.stream().filter(isODD)
										.collect(Collectors.toList());
		
		System.out.println(oddNumbers);
	}

}
