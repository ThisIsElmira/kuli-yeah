import java.util.Scanner;
public class demoConv
{
    static Scanner sc = new Scanner(System.in);
    static double m;
    public static double convCM()
    {
        return m*100;
    }

    public static double convMM()
    {
        return m*1000;
    }

    public static void displayConv()
    {
        System.out.println("Hasil konversi M ke CM: " + convCM() + " dan Hasil konversi M ke MM: " + convMM());
    }

    public static void main(String[] args)
    {
        System.out.print("Masukan angka dalam M: ");
        m = sc.nextDouble();
        displayConv();
    }
}