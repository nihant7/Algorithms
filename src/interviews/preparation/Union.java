package interviews.preparation;

public class Union {
	
	int V,E;
	Edge[] edges;
	
	class Edge{
		int rank, parent;
	}
	
	public Union(int v, int e) {
		V = v;
		E = e;
		edges = new Edge[E];
		for(int i = 0; i < e; i++) {
			edges[i] = new Edge();
		}
	}
	
	public void union(Edge[] subsets, int x, int y) {
		int xroot = find(subsets,x);
		int yroot = find(subsets,y);
		if(subsets[xroot].rank < subsets[yroot].rank) {
			subsets[xroot].parent = yroot;
		}
		else if(subsets[xroot].rank > subsets[yroot].rank) {
			subsets[yroot].parent = xroot;
		}
		else {
			subsets[yroot].parent = xroot;
			subsets[yroot].rank++;
		}
	}

	private int find(Edge[] subsets, int x) {
		return find(subsets, subsets[x].parent);
	}

}
