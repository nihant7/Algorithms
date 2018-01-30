package interviews.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Powerset {

	static void powerset(char[] A, int n) {
		int max_size = (1 << n);
		for(int i  = 0; i < max_size; i++) {
			System.out.print("{");
			for(int j = 0; j < n ; j++) {
				if((i & (1<<j)) > 0) {
					System.out.print(A[j] + " ");
				}
			}
			System.out.print("}");
		}
	}
	
	public static void main(String[] args) {
//		int n = 3;
//		int size = 1 << n;
//		char[] A = {'a','b','c'};
//		powerset(A,n);
		
		String[] arr = {"program", "creek", "is", "a", "java", "site"};
		List<String> arrList = Stream.of(arr).filter(t -> t.length() > 3).collect(Collectors.toList());
		System.out.println(Arrays.asList(arrList));
		Stream<Integer> stream = Arrays.asList(arr).stream().map(p -> p.length());
		Optional<Integer> sum = stream.reduce((x, y) -> x + y);
		sum.ifPresent(System.out::println);
	}
	
}
