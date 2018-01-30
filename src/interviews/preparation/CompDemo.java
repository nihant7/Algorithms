package interviews.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompDemo implements Comparable<CompDemo> {
	String movie;
	int year;
	
	CompDemo(String movieName, int yr) {
		movie = movieName;
		year = yr;
	}
	@Override
	public int compareTo(CompDemo val) {
		// TODO Auto-generated method stub
		return this.movie.compareTo(val.movie);
	}
	
	public static void main(String[] args) {
		ArrayList<CompDemo> list = new ArrayList<CompDemo>();
		list.add(new CompDemo("Star Wars - Force Awakens", 1977));
		list.add(new CompDemo("Star Wars - Return of Last Jedi", 2017));
		list.add(new CompDemo("Star Trek", 2016));
		
		// sort by name 
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).movie);
			System.out.println(list.get(i).year);
		}
				
	}

}
