package java_practice.collections.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> flist = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
		
		flist.stream()
					.filter(n -> n%2==0)
					.forEach(n -> System.out.println(n));
		
		List<Integer> slist = Arrays.asList(55,98,101,1,7,3,19,2,18);
		
		slist.stream()
					.sorted()
					.forEach(n->System.out.print(n+" "));
		
	}
	

}
