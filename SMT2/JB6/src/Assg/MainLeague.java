package JB6.src.Assg;

import java.util.Scanner;

public class MainLeague
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        PremierLeagueService data = new PremierLeagueService();
        int n = 5;

        for(int i = 0; i < n; i++)
        {
            System.out.println("====================");
            System.out.print("Team Name = ");
            String name = s2.nextLine();
            System.out.print("Play = ");
            int play = s1.nextInt();
            System.out.print("Goal = ");
            int goal = s1.nextInt();
            System.out.print("Points = ");
            int point = s1.nextInt();

            PremierLeague p = new PremierLeague(name, play, goal, point);
            data.add(p);
        }

        System.out.println("====================");
        System.out.println("Premiere League: ");
        System.out.println("====================");
        data.insertionSort();
        data.displayAll();
    }
}
