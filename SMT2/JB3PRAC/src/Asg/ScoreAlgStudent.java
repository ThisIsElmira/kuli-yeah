package Asg;

public class ScoreAlgStudent
{
    public String nameStudent;
    public int scoreAss, scoreQuiz, scoreMid, scoreFinal;

    double CalculateTotalScore()
    {
        return (scoreAss*0.3) + (scoreQuiz*0.2) + (scoreMid * 0.2) + (scoreFinal * 0.3);
    }
}
