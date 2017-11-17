package interviews.preparation;

public class Trie {
	TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	public void insert(String word) {
		TrieNode p = root;
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.toLowerCase().charAt(i);
			int index = c - 'a';
			if(p.arr[index] == null) {
				TrieNode tmp = new TrieNode();
				p.arr[index] = tmp;
				p = tmp;
			}
			else {
				p = p.arr[index];
			}
		}
		p.end = true; // end of word
	}
	
	public TrieNode search(String word) {
		TrieNode p = root;
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.toLowerCase().charAt(i);
			int index = c - 'a';
			if(p.arr[index] != null ) {
				p = p.arr[index];
			}
			else {
				return null;
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("Sea");
		System.out.println(trie.search("Seea"));
	}
}
