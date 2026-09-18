package Demo;

import java.util.*;

public class BSFGraph {
	static void bfs( 
			ArrayList<ArrayList<Integer>> graph,
			int start) {
		boolean[] visited = 
				new boolean[graph.size()];
		
		Queue<Integer> queue =
				new LinkedList<>();
		
		visited[start] = true;
		
		queue.add(start);
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			System.out.println(current + " ");
			
			for(int neighbour : graph.get(current)) {
				
				if(!visited[neighbour]) {
					
					visited[neighbour] = true;
					
					queue.add(neighbour);
				}
			}
		}
	}
}
