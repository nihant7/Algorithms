package interviews.preparation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
	private int V;
	private LinkedList<Integer> adj[];
	
	public TopologicalSort(int v) {
		V = v;
		for(int i = 0; i < v; i++) 
		adj[i] = new LinkedList<Integer>();
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
		visited[v] = true;
		Integer i;
		Iterator<Integer> it = adj[v].iterator();
		while(it.hasNext()) {
			i = it.next();
			if(!visited[i]) {
				topologicalSortUtil(i, visited, stack);
			}
			stack.push(new Integer(v));
		}
	}
	
	void TopologicalSort(boolean[] visited) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < V; i++) 
			visited[i] = false;
		
		for(int i = 0; i < V; i++) {
			if(visited[i] == false)
			topologicalSortUtil(i, visited, stack);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		TopologicalSort g = new TopologicalSort(6);
		g.addEdge(5, 0);
		g.addEdge(5, 2);
		g.addEdge(4, 0);
		g.addEdge(4, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 1);
		
		boolean[] visited = new boolean[6];
		g.TopologicalSort(visited);
		
	}
	
	
}
