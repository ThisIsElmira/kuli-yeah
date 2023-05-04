import  java.util.Scanner;
public class Main
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Input NIM: ");
        String NIM = input.nextLine();
        int last2digit = Integer.parseInt(String.format("%c%c", NIM.charAt(NIM.length()-2), NIM.charAt(NIM.length()-1)));
        int iteration = 1;
        int day = iteration;
        for (iteration = 1; iteration <= last2digit; iteration++)
        {
            if (day == 1)
            {
                System.out.println("Monday");
            }
            else if (day  == 2)
            {
                System.out.println("Tuesday");
            }
            else if (day == 3)
            {
                System.out.println("Wednesday");
            }
            else if (day == 4)
            {
                System.out.println("Thursday");
            }
            else if (day == 5)
            {
                System.out.println("Friday");
            }
            else if (day == 6)
            {
                System.out.println("Saturday");
            }
            else
            {
                System.out.println("Monday");
                day = 0;
            }
            day++;
        }
    }
}