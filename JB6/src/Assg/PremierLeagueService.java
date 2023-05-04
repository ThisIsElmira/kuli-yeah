package Assg;

import Prac.Students;

public class PremierLeagueService
{
    PremierLeague league[] = new PremierLeague[5];
    int index;

    void add(PremierLeague p)
    {
        if (index < league.length)
        {
            league[index] = p;
            index++;
        }
        else
        {
            System.out.println("The league list is full-filled");
        }
    }

    void displayAll()
    {
        for (PremierLeague p: league)
        {
            p.print();
            System.out.println("====================");
        }
    }

    void insertionSort()
    {
        for (int i = 0; i < league.length; i++)
        {
            PremierLeague temp = league[i];
            int j = i;
            while (j > 0 && league[j - 1].points < temp.points)
            {
                league[j] = league[j - 1];
                j--;
            }
            league[j] = temp;
        }
    }
}
