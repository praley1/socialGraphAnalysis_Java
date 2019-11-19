// source copied from http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
// Lars Vogel  Version 1.1  Copyright © 2009-2011, 2011 vogella GmbH  02.11.2009
// licensed under Eclipse Public License 1.0
// http://www.vogella.com/license.html
public class Edge  {
    private final String id;
    private final Vertex source;
    private final Vertex destination;
    private final int weight;

    public Edge(String id, Vertex source, Vertex destination, int weight) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }
    public Vertex getDestination() {
        return destination;
    }

    public Vertex getSource() {
        return source;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " " + destination;
    }

} 