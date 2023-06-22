package JB15.Asg;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        System.out.print("Insert amount of Vertices: ");
        int input = sc.nextInt();
        Graph<Integer> graph = new Graph<>(input);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);

        graph.printGraph();
        graph.removeEdge(1, 2);
        graph.printGraph();
        graph.degree(2);
        System.out.println("Is directed graph? " + graph.graphType());
    }
}
