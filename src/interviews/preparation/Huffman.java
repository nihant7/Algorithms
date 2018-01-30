package interviews.preparation;

import java.util.PriorityQueue;

public class Huffman {
	int data;
	char c;
	
	
	public void compress(char[] ch, int[] freq) {
		int N = ch.length;
		PriorityQueue<Huffman> pq = new PriorityQueue<Huffman>();
		Huffman hm = new Huffman();
		for(int i = 0; i < N; i++) {
			hm.data = freq[i];
			hm.c = ch[i];
			pq.add(hm);
		}
		
		while(!pq.isEmpty()) {
			Huffman l = pq.peek();
			pq.poll();
			
			Huffman r = pq.peek();
			pq.poll();
			
			Huffman hd = new Huffman();
			hd.data = l.data + r.data;
			
			// put it back
			pq.add(hd);
			
		}
	}

}
