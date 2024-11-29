package java_practice.collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> alist = Arrays.asList(21,5,9,8,7,3,6,1);

		alist.stream()
			.filter(n-> (n%2==1))
			.map(n -> n*2)
			.sorted()
		    .forEach(n -> System.out.println(n));

	}

}
