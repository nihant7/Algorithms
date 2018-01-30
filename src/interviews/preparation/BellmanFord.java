package interviews.preparation;

import java.util.Arrays;

public class BellmanFord {
	class Edge {
		int src, dest, weight;
		public Edge() {
			
		}
	};
	
	Edge[] edge;
	int V, E;
	
	BellmanFord(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
		for(int i = 0; i < E; i++) {
			edge[i] = new Edge();
		}
	}
	
	public void BMF(BellmanFord bf, int src) {
		
		int[] dist = new int[V];
		for(int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < V; i++) {
			for (int j = 0; j < E; j++) {
				// src
				int u = bf.edge[j].src;
				// dest
				int v = bf.edge[j].dest;
				int wt = bf.edge[j].weight;
				if(dist[v] > dist[u] + wt) {
					dist[v] = dist[u] + wt;
				}
			}
		}
		
		// Negative cycle
		for(int i = 0; i < V; i++) {
			for (int j = 0; j < E; j++) {
				// src
				int u = bf.edge[j].src;
				// dest
				int v = bf.edge[j].dest;
				int wt = bf.edge[j].weight;
				if(dist[u]!=Integer.MAX_VALUE && dist[v] > dist[u] + wt) {
					System.out.println("Negative Cycle exists");
				}
			}
		}
	}
	
	
	
	

	public static void main(String[] args) {
	}

}
