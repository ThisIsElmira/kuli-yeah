package JB15.Prac;


public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) list[i] = new LinkedList();
    }

    void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    void degree(int source) throws Exception {
        System.out.println("degree vertex " + list[source].size());

        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) if (list[i].get(j) == source) ++totalIn;
            for (k = 0; k < list[source].size(); k++) list[source].get(k);
            totalOut = k;
        }
        System.out.println("Indegree from vertex " + source + " : " + totalIn);
        System.out.println("Outdegree from vertex " + source + " : " + totalOut);
        System.out.println("Vertex degree " + source + " : " + (totalIn + totalOut));
    }

    void removeEdge(int source, int destination) throws Exception {
        // for (int i = 0; i < vertex; i++) if (i == destination) list[source].remove(destination);
        int destinationIndex = list[source].sequentialSearch(destination);
        int sourceIndex = list[destination].sequentialSearch(source);
        list[source].remove(destinationIndex);
        list[destination].remove(sourceIndex);
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) list[i].clear();
        System.out.println("Graph is deleted");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) System.out.print(list[i].get(j) + " ");
                System.out.println();
            }
        }
        System.out.println();
    }

    boolean graphType() throws Exception {
        int totalIn = 0, totalOut = 0;
        for (int source = 0; source < vertex; source++) {
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) totalIn++;
                }
                for (int j = 0; j < list[source].size(); j++) {
                    if (list[source].get(j) == i) totalOut++;
                }
            }
        }
        return (totalIn != totalOut);
    }
}
