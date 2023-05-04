import java.util.Scanner;
public class BallMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        Ball[] ballArray = new Ball[j];

        for (int i = 0; i < j; i++)
        {
            ballArray[i] = new Ball();
            System.out.println("Ball " + i);

            System.out.println("input r: ");
            ballArray[i].r = sc.nextInt();
            System.out.println(ballArray[i]);
            System.out.println(ballArray);
            System.out.println("Area of Ball " + i + ": " + ballArray[i].hitungLuas() + " and the Volume of the Ball " + i + ": " + ballArray[i].hitungVolume());
        }
    }
}
