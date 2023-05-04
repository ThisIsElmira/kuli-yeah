package uts;

import java.util.Scanner;

public class ItemMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("========");
        System.out.println("Stock Management Program");
        System.out.println("========");
        ItemMenu menuProgram = new ItemMenu();
        int menu;
        do {
            System.out.println("Stock menu");
            System.out.println("1. Add Item");
            System.out.println("2. Display Item(s)");
            System.out.println("3. Sort Item based on stock (ascending)");
            System.out.println("4. Display Item that has no stock");
            System.out.println("5. Search Item");
            System.out.println("6. Add Stock");
            System.out.println("7. Decrease Stock");
            System.out.print("Choose Menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    menuProgram.addItem();
                    break;
                case 2:
                    menuProgram.displayItem();
                    break;
                case 3:
                    menuProgram.sortItem();
                    break;
                case 4:
                    menuProgram.ItemNoStock();
                    break;
                case 5:
                    menuProgram.search();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please select menu correctly!");
                    break;
            }
        }
        while (menu != 0);
    }
}
