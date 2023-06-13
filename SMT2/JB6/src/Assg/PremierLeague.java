package JB6.src.Assg;

public class PremierLeague
{
    String team;
    int play, goal, points;

    PremierLeague(String t, int p, int g, int pt)
    {
        team = t;
        play = p;
        goal = g;
        points = pt;
    }

    void print()
    {
        System.out.println("Team = " + team);
        System.out.println("Play = " + play);
        System.out.println("Goal = " + goal);
        System.out.println("Points = " + points);
    }
}
