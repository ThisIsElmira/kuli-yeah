import java.util.Scanner;
public class Main
{
    static Scanner input = new Scanner(System.in);
    static void finalscore(int a, int m, int f)
    {
        double average = ((0.2*a) + (0.35*m) + (0.45*f));
        System.out.println("Nilai Akhir: " + average);
        if(average > 50)
        {
            if (average > 80)
            {
                System.out.println("Nilai Huruf: A");
            }
            else if (average > 73)
            {
                System.out.println("Nilai Huruf: B+");
            }
            else if (average > 65)
            {
                System.out.println("Nilai Huruf: B");
            }
            else if (average > 60)
            {
                System.out.println("Nilai Huruf: C+");
            }
            else
            {
                System.out.println("Nilai Huruf: C");
            }
            System.out.println("==============================");
            System.out.println("Selamat Lulus!");
        }
        else
        {
            if (average > 39)
            {
                System.out.println("Nilai Huruf: D");
            }
            else
            {
                System.out.println("Nilai Huruf: E");
            }
            System.out.println("==============================");
            System.out.println("NT Masbro! Try Again Later!");
        }
    }
    static int limited(String message)
    {
        while (true)
        {
            System.out.print(message);
            int userInput = input.nextInt();
            input.nextLine();
            if (userInput > 0 && userInput <= 100)
            {
                return userInput;
            }
            System.out.println("Nilai Tugas tidak bisa < 0 atau > 100!");
        }
    }
    public static void main(String[] args)
    {

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        int assignment = Integer.parseInt(String.format("%d", limited("Masukkan Nilai Tugas: ")));
        int midterm = Integer.parseInt(String.format("%d", limited("Masukkan Nilai UTS: ")));
        int finalsc = Integer.parseInt(String.format("%d", limited("Masukkan Nilai UAS: ")));
        System.out.println("==============================");
        finalscore(assignment, midterm, finalsc);
    }
}