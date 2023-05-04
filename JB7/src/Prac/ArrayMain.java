package Prac;

import java.util.Scanner;

public class ArrayMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArraySearch array2d = new ArraySearch();

        System.out.println("Searching Program with Sequential");
        System.out.print("Search: ");
        int search = sc.nextInt();

        int[] pos = array2d.sequentialSearch(search);
        if (pos[0] == -1 && pos[1] == -1) System.out.println("Data: " + search + " isn't found");
        else System.out.println("Data: " + search + " is found at row " + pos[0] + " and column " + pos[1]);
    }
}
