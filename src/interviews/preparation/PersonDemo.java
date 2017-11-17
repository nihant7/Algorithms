package interviews.preparation;

import java.util.Arrays;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();

		p1.setFirstname("John");
		p2.setFirstname("John");
		
		char[] chp1 = p1.getFirstname().toCharArray();
		char[] chp2 = p2.getFirstname().toCharArray();
		
		Object[] arr1 = {chp1};
		Object[] arr2 = {chp2};

		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		
		int i = 'S' - 'a';
		System.out.println(i);

	}
	
}
