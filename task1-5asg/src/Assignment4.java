import java.util.Scanner;

public class Assignment4
{
    static Scanner sc = new Scanner(System.in);
    public static double area;
    public static void areaOfTriangle()
    {
        System.out.print("Input Height: ");
        int height = sc.nextInt();
        System.out.print("Input Side: ");
        int side = sc.nextInt();
        area = 1.0/2*height*side;
        System.out.println("Area of Triangle is: " + area + "\n");
    }

    public static void areaOfRectangle()
    {
        System.out.print("Input Height: ");
        int height = sc.nextInt();
        System.out.print("Input Width: ");
        int width = sc.nextInt();
        area = height*width;
        System.out.println("Area of Rectangle is: " + area + "\n");
    }

    public static void areaOfCircle()
    {
        System.out.print("Input Radius: ");
        int r = sc.nextInt();
        area = Math.PI*r*r;
        System.out.print("Area of Circle is: " + area + "\n");
    }

    public static void main(String[] args)
    {
        int menu = 0;
        do
        {
            System.out.println("Select Menu: ");
            System.out.println("1. Area of Triangle");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("0. Exit");
            menu = sc.nextInt();
            switch (menu)
            {
                case 1:
                    areaOfTriangle();
                    break;
                case 2:
                    areaOfRectangle();
                    break;
                case 3:
                    areaOfCircle();
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
