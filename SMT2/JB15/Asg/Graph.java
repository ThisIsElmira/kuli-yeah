package JB15.Asg;

import java.util.HashMap;
import java.util.Objects;

public class Graph<TData>
{
    int vertex;
    HashMap<TData, DoubleLinkedList<TData>> list;

    Graph (int vertex)
    {
        this.vertex = vertex;
        list = new HashMap<>();
    }

    void addEdge(TData source, TData destination)
    {
        list.putIfAbsent(source, new DoubleLinkedList<>());
        list.putIfAbsent(destination, new DoubleLinkedList<>());

        list.get(source).addFirst(destination);
        list.get(destination).addFirst(source);
    }

    void degree(TData source) throws Exception
    {
        System.out.println("degree vertex" + source + " : " + list.get(source).size());

        int totalIn = 0, totalOut = 0;
        for (TData key : list.keySet())
        {
            for (int j = 0; j < list.get(key).size(); j++)
            {
                if (Objects.equals(list.get(key).get(j), source)) totalIn++;
            }
            for (int j = 0; j < list.get(source).size(); j++)
            {
                if (Objects.equals(list.get(source).get(j), key)) totalOut++;
            }
        }

        System.out.println("Indegree from vertex " + source + " : " + totalIn);
        System.out.println("Outdegree from vertex " + source + " : " + totalOut);
        System.out.println("Degree from vertex " + source + " : " + (totalIn + totalOut));
    }

    void removeEdge(TData source, TData destination) throws Exception
    {
        int destinationIndex = list.get(source).search(destination);
        int sourceIndex = list.get(destination).search(source);
        list.get(source).remove(destinationIndex);
        list.get(destination).remove(sourceIndex);
    }

    void printGraph() throws Exception
    {
        for (TData key : list.keySet())
        {
            if (list.get(key).size() > 0)
            {
                System.out.print("Vertex " + key + " connected with: ");
                for (int j = 0; j < list.get(key).size(); j++) System.out.print(list.get(key).get(j) + " ");
                System.out.println();
            }
        }
        System.out.println();
    }

    boolean graphType() throws Exception
    {
        int totalIn = 0, totalOut = 0;
        for (TData key : list.keySet())
        {
            for (int j = 0; j < list.get(key).size(); j++)
            {
                if (list.get(key).get(j) == key) totalIn++;
            }
            for (int j = 0; j < list.get(key).size(); j++)
            {
                if (list.get(key).get(j) == key) totalOut++;
            }
        }
        return (totalIn != totalOut);
    }
}
