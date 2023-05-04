package Practice3;
import java.util.Scanner;
public class StudentMain
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Student[] studentArray = new Student[3];
        for (int i = 0; i < 3; i++)
        {
            studentArray[i] = new Student();
            System.out.println("Insert " + (i+1) + " student data");

            System.out.print("Insert name :");
            studentArray[i].name = sc.nextLine();
            System.out.print("Insert nim :");
            studentArray[i].nim = sc.nextDouble();
            sc.nextLine();
            System.out.print("Insert gender :");
            studentArray[i].gender = sc.nextLine();
            System.out.print("Insert IPK :");
            studentArray[i].ipk = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.println(i + " Student Data");
            System.out.println("name : " + studentArray[i].name);
            System.out.println("nim : " + studentArray[i].nim);
            System.out.println("gender : " + studentArray[i].gender);
            System.out.println("IPK score : " + studentArray[i].ipk);
        }
        System.out.println("Average IPK of all students : " + studentArray[0].averageIPK(studentArray));
    }
}
