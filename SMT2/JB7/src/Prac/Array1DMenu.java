package Prac;
import java.util.Scanner;

public class Array1DMenu
{
    Array1D array = new Array1D();
    Scanner sc = new Scanner(System.in);
    void searchMenu()
    {
        System.out.println("------------");
        System.out.println("Search Value");
        System.out.println("------------");
        System.out.print("Search for: ");
        int search = sc.nextInt();
        int pos = array.sequentialSearch(search);
        if (pos == -1) System.out.println("Data: " + search + " isn't found");
        else System.out.println("Data: " + search + " found at index-" + pos);
    }

    void sortAscMenu()
    {
        System.out.println("------------");
        System.out.println("Sort Array by Ascending");
        System.out.println("------------");
        System.out.println("Sorted data");
        array.insertionSortAscend();
        array.printArray();
        System.out.println();
    }

    void sortDscMenu()
    {
        System.out.println("------------");
        System.out.println("Sort Array by Descending");
        System.out.println("------------");
        System.out.println("Sorted data");
        array.insertionSortDescend();
        array.printArray();
        System.out.println();
    }

    void biggestValue()
    {
        int[] big = array.getBiggestValue();
        System.out.println("------------");
        System.out.println("Get Biggest Value");
        System.out.println("------------");
        System.out.println("The Biggest Value is " + big[1] + " at index " + big[0]);
    }
}
