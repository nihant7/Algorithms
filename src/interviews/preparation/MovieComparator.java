package interviews.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MovieComparator implements Comparator<Movie> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie m1 = new Movie("Guardians of the Galaxy", 2014);
		Movie m2 = new Movie("Doctor Strange", 2016);
		
		List<Movie> list = new ArrayList<Movie>();
		list.add(m1);
		list.add(m2);
		
		Collections.sort(list, new MovieComparator());
		
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i).getName());
		
		
		
		}

	}

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
