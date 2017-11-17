package interviews.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExample {

	public static void main(String[] args) {
		
		// 
		List<String> al = Arrays.asList("New", "Programming", "Pen", "Power", "Jenny");
		
		al
		.parallelStream()
		.filter(s -> s.startsWith("p") || s.startsWith("P"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);
		
		//
		addList arr = () -> { 
							return (ArrayList<String>) Stream.of("hello", "java", "nihant")
							.map(string -> string.toUpperCase())
							.collect(Collectors.toList()); 
							};
		
		
		myLambda lambda = () -> System.out.println("Hey I'm just a budding lambda");
		add l = (String s) -> { 
			Set<Character> set = new HashSet<Character>();
			char[] ch = s.toCharArray();
			for(char c : ch) 
				set.add(c);
			return set;
		};
		lambda.greet();
		System.out.println(l.addToHashSet("aaabcsss"));
		System.out.println(arr.addToList());
	}
	
	
	
}

	interface addList {
		ArrayList<String> addToList();
	}

	interface myLambda {
		public void greet();
	}
	
	interface add {
		public Set<Character> addToHashSet(String s);
	}


