import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class TestAlgorithm {
    private List<Vertex> nodes;
    private List<Edge> edges;

    public void testExecute(String graphDataFile) {
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();

        readGraphData(graphDataFile);
        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);

        dijkstra.execute(nodes.get(0)); // solve from first node

        for (int nodeIndex = 1; nodeIndex < nodes.size(); nodeIndex++)
            dumpPath(dijkstra, nodeIndex);
    }

    private void dumpPath(DijkstraAlgorithm dijkstra, int nodeIndex) {
        System.out.print("Node " + nodes.get(nodeIndex).getName() + ": ");
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(nodeIndex));
        if (path != null) {
            for (Vertex vertex : path) {
                System.out.print(vertex);
                System.out.print(" ");
            }
        }
        else {
            System.out.print("UNREACHABLE");
        }
        System.out.println("");
    }

    private Vertex findVertexByName(String name) {
        int index = 0;
        while ( ! nodes.get(index).getName().equals(name) )
            index++;
        return nodes.get(index);
    }

    private void readGraphData(String fileName) {
        Scanner sc;
        try {
            sc = new Scanner(new File(fileName));
            System.out.println("Reading data from " + fileName);
            int numVertices = sc.nextInt();
            System.out.print(numVertices + " vertices expected");
            for (int i = 0; i < numVertices; i++) {
                String node_name = sc.next();
                Vertex location = new Vertex("Node_" + i, node_name);
                nodes.add(location);
            }
            System.out.println(", graph now has " + nodes.size());
            int numEdges = sc.nextInt();
            System.out.print(numEdges + " edges expected");
            for (int i = 0; i < numEdges; i++) {
                String startNode = sc.next();
                String endNode = sc.next();
                int weight = sc.nextInt();
                Edge newEdge = new Edge("Edge_" + i , findVertexByName(startNode), findVertexByName(endNode), weight);
                edges.add(newEdge);
            }
            System.out.println(", graph now has " + edges.size());
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file " + fileName + ": " + e.getMessage());
        }
    }
}