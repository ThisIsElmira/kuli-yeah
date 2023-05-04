package Practice2;
import java.util.Scanner;
public class LandMain
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.print("How many lands: ");
        int j = sc.nextInt();
        Land[] landArray = new Land[j];
        for (int i = 0; i < j; i++) {
            landArray[i] = new Land();
            System.out.println("Land " + (i + 1));

            System.out.print("Length: ");
            landArray[i].length = sc.nextInt();
            System.out.print("Width: ");
            landArray[i].width = sc.nextInt();
        }

        for (int i = 0; i < j; i++)
        {
            System.out.println("Land Area " + (i+1) + ": " + landArray[i].landArea());
        }

        System.out.println("The widest land is Land " + landArray[0].widestArea(landArray));
    }
}
