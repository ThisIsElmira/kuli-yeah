package JB15.Prac;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        System.out.print("Insert amount of Vertices: ");
        int input = sc.nextInt();
        Graph graph = new Graph(input);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//        graph.removeEdge(1, 2);
//        graph.printGraph();
        int menu, source, destination;
        do
        {
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Print Graph");
            System.out.println("4. Degree");
            System.out.println("5. Remove All Edges");
            System.out.println("6. Exit");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Add Edge");
                    System.out.print("Source: ");
                    source = sc.nextInt();
                    System.out.print("Destination: ");
                    destination = sc.nextInt();
                    graph.addEdge(source, destination);
                    break;
                case 2:
                    System.out.println("Remove Edge");
                    System.out.print("Source: ");
                    source = sc.nextInt();
                    System.out.print("Destination: ");
                    destination = sc.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 3:
                    System.out.println("Graph");
                    graph.printGraph();
                    break;
                case 4:
                    System.out.print("Degree: ");
                    graph.degree(sc.nextInt());
                    break;
                case 5:
                    graph.removeAllEdges();
                    System.out.println("All Edges are removed");
                    break;
                case 0:
                    System.out.println("Thank you for using");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select menu correctly!");
            }
        }
        while (menu != 0);
    }
}
