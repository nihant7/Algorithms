package interviews.preparation;

import java.util.HashSet;

public class Dems {

	String name;
	int id;
	
	Dems() {
		
	}
	
	Dems(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public boolean repeatG(String text) {
		char[] pattern = text.toCharArray();
		int s = 1, e = pattern.length;
		boolean flag = false;
		while(s < e) {
			if(pattern[s-1] == pattern[s] && pattern[s-1] == 'g' && pattern[s] == 'g') {
				flag = true;
				s++;
			}
			else if(pattern[s-1] == pattern[s] && (pattern[s-1] != 'g' || pattern[s] != 'g')) {
				flag=false;
			}
			else if(pattern[s-1] != pattern[s] && (pattern[s-1] == 'g' || pattern[s] != 'g')) {
				flag = false;
			}
			else if(pattern[s-1] != pattern[s] && (pattern[s-1] != 'g' || pattern[s] == 'g')) {
				flag = false;
			}
			s++;
 		}
		return flag;
	}
	


	
	public static void main(String[] args) {
		Dems d = new Dems();
		
		
		System.out.println(d.repeatG("fhdjfjfjjggdjdjdhgggdkjddgjdjdg"));
	}
	

}
