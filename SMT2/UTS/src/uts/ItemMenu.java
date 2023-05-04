package uts;

import java.util.Scanner;

public class ItemMenu
{
    Scanner sc = new Scanner(System.in);
    Scanner sn = new Scanner(System.in);
    ItemProgram data = new ItemProgram();

    void addItem()
    {
        System.out.println("========");
        System.out.println("Add Item");
        System.out.println("========");
        System.out.print("ItemCode = ");
        int code = sn.nextInt();
        System.out.print("Name = ");
        String name = sc.nextLine();
        System.out.print("Category = ");
        String category = sc.nextLine();
        System.out.print("Initial Stock = ");
        int stock = sn.nextInt();

        ItemData t = new ItemData(code, stock, name, category);
        data.add(t);
        System.out.println("Item added!");
        System.out.println("========");
    }

    void displayItem()
    {
        System.out.println("========");
        System.out.println("Display Item(s)");
        System.out.println("========");
        data.displayAll();
        System.out.println("========");
    }

    void sortItem()
    {
        System.out.println("========");
        System.out.println("Sort Item based on stock (ascending)");
        System.out.println("========");
        data.bubbleSort();
        data.displayAll();

        System.out.println("Data is sorted!");
        System.out.println("========");
    }

    void ItemNoStock()
    {
        System.out.println("========");
        System.out.println("Display Item that has no stock");
        System.out.println("========");
        data.displayNoStock();
        System.out.println("========");
    }

    void search()
    {
        System.out.println("========");
        System.out.println("Search Item");
        System.out.println("========");
        System.out.print("Name = ");
        String search = sc.nextLine();
        int pos = data.findNameSequential(search);
        System.out.println("========");
        System.out.println("Data found!");
        System.out.println("========");
        data.showData(pos);
        System.out.println("========");
    }
}
