package Asg;

public class CandidateVotes
{
    public int element;
    public String[] votes;

    public CandidateVotes(int element)
    {
        this.element = element;
        votes = new String[element];
    }

    public String votesCount(String[] votes, int left, int right)
    {
        String result = "";
        if (left == right)
        {
            result = votes[left];
        }
        else
        {
            int mid = (left + right) / 2;
            String rightResult = votesCount(votes, left, mid);
            String leftResult = votesCount(votes, mid + 1, right);
        }
        return result;
    }

    public String votesPrint()
    {
        String voteSelected = "";
        int num = 0;
        for (int i = 0; i < element; i++)
        {
            int count = 0;
            for (int j = 0; j < element; j++)
            {
                if (votes[i].equals(votes[j]))
                {
                    count++;
                }
            }
            if (count > num)
            {
                num = count;
                voteSelected = votes[i];
            }
        }
        return voteSelected;
    }
}
