import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Vertex<String> letterB = new Vertex<>("B");
        Vertex<String> letterA = new Vertex<>("A");
        Vertex<String> letterD = new Vertex<>("D");
        Vertex<String> letterC = new Vertex<>("C");
        Edge<String> edgeBA = new Edge<>(letterB, letterA, 1);
        Edge<String> edgeAD = new Edge<>(letterA, letterD, 1);
        Edge<String> edgeDC = new Edge<>(letterD, letterC, 1);

        Set<Vertex<String>> vertices = new HashSet<>();
        vertices.add(letterA);
        vertices.add(letterB);
        vertices.add(letterC);
        vertices.add(letterD);

        Set<Edge<String>> edges = new HashSet<>();
        edges.add(edgeBA);
        edges.add(edgeAD);
        edges.add(edgeDC);

        Graph<String> mainGraph = new Graph<>(vertices, edges);

        List<Vertex<String>> dfsSearch = GraphAlgorithms.dfs(letterB, mainGraph);
        System.out.println(dfsSearch);

        List<Vertex<String>> bfsSearch = GraphAlgorithms.bfs(letterB, mainGraph);
        System.out.println(bfsSearch);








    }
}
