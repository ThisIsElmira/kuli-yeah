import java.util.Scanner;
public class TriangleMain {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Amount"); int N = sc.nextInt();
        LoveTriangle[]Triangle = new LoveTriangle[N];
        for (int i = 0;i<N;i++){
            System.out.println("Segitiga"+ (i+1));
            System.out.print("Input Alas   : ");
            int Alas =sc.nextInt();
            System.out.print("Input Tinggi : ");
            int Tinggi = sc.nextInt();
            Triangle[i]=new LoveTriangle(Alas,Tinggi);
            System.out.println("================");
            System.out.println("Luas permukaan : "+Triangle[i].HitungLuas());
            System.out.println("Volume         : "+Triangle[i].HitungVolume());
        }


    }
}
