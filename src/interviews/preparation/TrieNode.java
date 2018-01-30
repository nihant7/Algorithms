package interviews.preparation;

import java.util.HashMap;

public class TrieNode {
	TrieNode[] arr = new TrieNode[26];
	TrieNode root;
	boolean end;
	TrieNode() {
		end = false;
		for(int i = 0; i < 26; i++)  {
		arr[i] = null;		
		}
	}
	
	public void addWord(String word) {
		
		TrieNode p = root;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if(p.arr[index] == null) {
				TrieNode node = new TrieNode();
				p.arr[index] = node;
			}
			else {
				p = p.arr[index];
			}
		}
		p.end = true;
	}
	
	public boolean search(String word) {
		TrieNode p = root;
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if(p.arr[index] == null) {
				return false;
			}
			else {
				p = p.arr[index];
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		TrieNode t = new TrieNode();
		t.addWord("sea");
	}
}
