package Prac;
import java.util.Scanner;

public class Array1DMain
{
    public static void main(String[] args)
    {
        Array1D array = new Array1D();
        Array1DMenu arrayMenu = new Array1DMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("------------");
        array.printArray();
        System.out.println();
        int menu;
        do
        {
            System.out.println("------------");
            System.out.println("Array 1D menu");
            System.out.println("1. Search Value");
            System.out.println("2. Sort Array by Ascending");
            System.out.println("3. Sort Array by Descending");
            System.out.println("4. Get Biggest Value");
            System.out.print("Choose Menu: ");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                    arrayMenu.searchMenu();
                    break;
                case 2:
                    arrayMenu.sortAscMenu();
                    break;
                case 3:
                    arrayMenu.sortDscMenu();
                    break;
                case 4:
                    arrayMenu.biggestValue();
                    break;
                case 0:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Please choose Menu correctly!");
                    break;
            }
        }
        while (menu != 0);
    }
}
