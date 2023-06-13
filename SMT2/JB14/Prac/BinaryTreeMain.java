package JB14.Prac;

import java.util.Scanner;

public class BinaryTreeMain
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();

//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//        bt.add(10);
//        bt.add(15);
//
//        bt.traversePreOrder(bt.root);
//        System.out.println();
//        bt.traverseInOrder(bt.root);
//        System.out.println();
//        bt.traversePostOrder(bt.root);
//        System.out.println();
//        System.out.println("Find " + bt.find(5));
//        bt.delete(8);
//        bt.traversePreOrder(bt.root);
//        System.out.println();
//
//        BinaryTreeArray bta = new BinaryTreeArray();
//        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
//        int idxLast = 6;
//        bta.populateData(data, idxLast);
//        bta.traverseInOrder(0);

        int menu;
        do
        {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Find");
            System.out.println("4. traverseInOrder");
            System.out.println("5. traversePreOrder");
            System.out.println("6. traversePostOrder");
            System.out.println("7. Exit");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Insert Data");
                    System.out.print("Data node : ");
                    int data = sc.nextInt();
                    bt.add(data);
                    break;
                case 2:
                    System.out.println("Delete Data");
                    System.out.print("Data node : ");
                    int deleteData = sc.nextInt();
                    bt.delete(deleteData);
                    break;
                case 3:
                    System.out.println("Find Data");
                    System.out.print("Data node : ");
                    int searchData = sc.nextInt();
                    System.out.println(bt.find(searchData) ? "Found" : "Not Found");
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid menu");
                    break;
            }
        }
        while (menu != 7);
    }
}
