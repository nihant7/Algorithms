package interviews.preparation;

 class Cycle  {
	Edge[] edge;
	int V, E;
	
	class Edge {
	int src, dest, weight;
	};
	
	Cycle(int v, int e) {
		V = v;
		E = e;
		edge = new Edge[E];
		for(int i = 0; i < e; ++i) {
		edge[i] = new Edge();
		}
	}
	
	public int find(int[] subset, int j) {
		if(subset[j] == -1) return -1;
		else
		return find(subset, subset[j]);
	}
	
	public static void main(String[] args) {
		
		int V = 3, E = 3;
		Cycle cycle = new Cycle(V,E);
		
		cycle.edge[0].src = 0;
		cycle.edge[0].dest = 1;
		
		cycle.edge[1].src = 1;
		cycle.edge[1].dest = 2;
		
		cycle.edge[2].src = 2;
		cycle.edge[2].dest = 0;
		
	}

	

	

}
