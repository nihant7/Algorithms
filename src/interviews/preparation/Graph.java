package interviews.preparation;

// Java Program for union-find algorithm to detect cycle in a graph
import java.util.*;
import java.lang.*;
import java.io.*;

class Graph
{
	int V, E; // V-> no. of vertices & E->no.of edges
	Edge edge[]; // /collection of all edges

	class Edge
	{
		int src, dest;
	};

	// Creates a graph with V vertices and E edges
	Graph(int v,int e)
	{
		V = v;
		E = e;
		edge = new Edge[E];
		for (int i=0; i<e; ++i)
			edge[i] = new Edge();
	}

	


	

	// Driver Method
	public static void main (String[] args)
	{
		/* Let us create following graph
		0
		| \
		| \
		1-----2 */
		int V = 3, E = 3;
		Graph graph = new Graph(V, E);

		// add edge 0-1
		graph.edge[0].src = 0;
		graph.edge[0].dest = 1;

		// add edge 1-2
		graph.edge[1].src = 1;
		graph.edge[1].dest = 2;

		// add edge 0-2
		graph.edge[2].src = 0;
		graph.edge[2].dest = 2;
		
		System.out.println( graph.edge[0].src );

	}
}
