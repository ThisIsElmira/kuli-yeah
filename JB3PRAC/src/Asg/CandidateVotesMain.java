package Asg;

import java.util.Scanner;

public class CandidateVotesMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of candidate: ");
        int candNum = sc.nextInt();
        CandidateVotes vot = new CandidateVotes(candNum);
        vot.element = candNum;

        for (int i = 0; i < vot.element; i++)
        {
            System.out.print("Input the name from the vote number " + (i+1) + ": ");
            vot.votes[i] = sc.next();
        }

        vot.votesCount(vot.votes, 0, vot.element - 1);
        System.out.println("The winner for the election is " + vot.votesPrint());
    }
}