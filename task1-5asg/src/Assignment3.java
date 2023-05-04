import java.util.Scanner;
public class Assignment3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the n number: ");
        int n = sc.nextInt();

        for (int i = 0; n > 0; i++)
        {
            if (i % 2 == 0 && i % 4 != 0)
            {
                System.out.print(i + " ");
                n--;
            }
        }
    }
}
