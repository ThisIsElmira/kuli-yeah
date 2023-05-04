package Practice1;
import java.util.Scanner;
public class PracticeMain
{
    static Scanner sc = new Scanner(System.in);
    public static void blockAttributes()
    {
        System.out.print("Insert how much block you want: ");
        int j = sc.nextInt();
        Block[] blockArray = new Block[j];
        for (int i = 0; i < j; i++)
        {
            blockArray[i] = new Block();
            System.out.println("Block " + (i+1));

            System.out.print("input width: ");
            blockArray[i].width = sc.nextInt();
            System.out.print("input length: ");
            blockArray[i].length = sc.nextInt();
            System.out.print("input height: ");
            blockArray[i].height = sc.nextInt();
            System.out.println("Surface Area of Block " + (i+1) + ": " + blockArray[i].countSurfaceArea() + " and the Volume of the Block " + (i+1) + ": " + blockArray[i].countVolume());
        }
    }

    public static void cubeAttributes()
    {
        System.out.print("Insert how much cube you want: ");
        int j = sc.nextInt();
        Cube[] cubeArray = new Cube[j];
        for (int i = 0; i < j; i++)
        {
            cubeArray[i] = new Cube();
            System.out.println("Cube " + (i+1));

            System.out.print("input side: ");
            cubeArray[i].side = sc.nextInt();
            System.out.println("Surface Area of Cube " + (i+1) + ": " + cubeArray[i].countSurfaceArea() + " and the Volume of the Cube " + (i+1) + ": " + cubeArray[i].countVolume());
        }
    }

    public static void cylinderAttributes()
    {
        System.out.print("Insert how much cylinder you want: ");
        int j = sc.nextInt();
        Cylinder[] cylinderArray = new Cylinder[j];
        for (int i = 0; i < j; i++)
        {
            cylinderArray[i] = new Cylinder();
            System.out.println("Cylinder " + (i+1));

            System.out.print("input radius: ");
            cylinderArray[i].rad = sc.nextInt();
            System.out.print("input height: ");
            cylinderArray[i].height = sc.nextInt();
            System.out.println("Surface Area of Cylinder " + (i+1) + ": " + cylinderArray[i].countSurfaceArea() + " and the Volume of the Cylinder " + (i+1) + ": " + cylinderArray[i].countVolume());
        }
    }
    public static void main(String[] args)
    {

        int menu;
        do
        {
            System.out.println("---------------------");
            System.out.println("Select type of Object");
            System.out.println("1. Block");
            System.out.println("2. Cube");
            System.out.println("3. Cylinder");
            System.out.println("0. Exit");
            System.out.println("---------------------");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                    blockAttributes();
                    break;
                case 2:
                    cubeAttributes();
                    break;
                case 3:
                    cylinderAttributes();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please Select Menu Correctly!");
            }
        }
        while (menu != 0);
    }
}
