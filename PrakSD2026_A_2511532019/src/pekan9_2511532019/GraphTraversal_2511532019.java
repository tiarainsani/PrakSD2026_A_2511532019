package pekan9_2511532019;

import java.util.Queue;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;


public class GraphTraversal_2511532019 {
	private Map<String, List<String>> graph = new HashMap<>();
	//Menambahkan edge (graf tak berarah)
	public void addEdge_2019 (String node1_2019, String node2_2019) {
		graph.putIfAbsent(node1_2019, new ArrayList<>());
		graph.putIfAbsent(node2_2019, new ArrayList<>());
		graph.get (node1_2019).add(node2_2019);
		graph.get(node2_2019).add(node1_2019);
	}
	//menampilkan graf awal
	public void printGraph_2019() {
		System.out.println("Graf Awal (Adjancency List): ");
		for(String node_2019 : graph.keySet()) {
			System.out.print(node_2019+" -> ");
			List<String> neighbors_2019=graph.get(node_2019);
			System.out.println(String.join(", ", neighbors_2019));
		}
		System.out.println();
	}
	//DFS rekursif
	public void dfs_2019 (String start_2019) {
		Set<String> visited_2019=new HashSet<>();
		System.out.println("Penelusuran DFS: ");
		dfsHelper_2019(start_2019,visited_2019);
		System.out.println();
	}
	private void dfsHelper_2019(String current_2019, Set<String>visited_2019) {
		if (visited_2019.contains(current_2019)) return;
		visited_2019.add(current_2019);
		System.out.print(current_2019+ " ");
		for (String neighbor_2019:graph.getOrDefault(current_2019,new ArrayList<>())) {
			dfsHelper_2019 (neighbor_2019, visited_2019);
		}
	}
	//BFS iteratif
	public void bfs_2019 (String start_2019) {
		Set <String>visited_2019=new HashSet<>();
		Queue <String> queue_2019= new LinkedList<>();
		queue_2019.add(start_2019);
		visited_2019.add(start_2019);
		System.out.println("Penelusuran BFS: ");
		while (!queue_2019.isEmpty()) {
			String current_2019=queue_2019.poll();
			System.out.print(current_2019+" ");
			for (String neighbor_2019:graph.getOrDefault(current_2019, new ArrayList<>())) {
				if (!visited_2019.contains(neighbor_2019)){
					queue_2019.add(neighbor_2019);
					visited_2019.add(neighbor_2019);
				}
			}
		}
		System.out.println();
	}
	//Main
	public static void main (String [] args) {
		GraphTraversal_2511532019 graph_2019=new GraphTraversal_2511532019();
		//contoh graf : A-B, A-C, B-D, B-E
		graph_2019.addEdge_2019("A","B");
		graph_2019.addEdge_2019("A","C");
		graph_2019.addEdge_2019("B","D");
		graph_2019.addEdge_2019("B","E");
		//cetak graf awal
		System.out.println("Graf Awal adalah: ");
		graph_2019.printGraph_2019();
		//Lakukan penelusuran
		graph_2019.dfs_2019("A");
		graph_2019.bfs_2019("A");
	}

}
