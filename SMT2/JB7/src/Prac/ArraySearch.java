package JB7.src.Prac;


public class ArraySearch
{
    int[][] data = {{45, 78, 7, 200, 80}, {90, 1, 17, 100, 50}, {21, 2, 40, 18, 65}};

    int[] sequentialSearch(int search)
    {
        int[] pos = new int[2];
        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data[row].length; col++)
            {
                if(data[row][col] == search)
                {
                    pos [0] = row;
                    pos [1] = col;
                    return pos;
                }
            }
        }
        return pos;
    }
}