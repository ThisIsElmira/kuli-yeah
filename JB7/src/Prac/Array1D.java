package Prac;

public class Array1D
{
    int[] data = {12, 17, 2, 1 , 70, 50, 90, 17, 2, 90};

    void printArray()
    {
        for (int i = 0; i < data.length; i++) System.out.print(data[i] + " ");
    }
    void insertionSortAscend()
    {
        int tmp;
        for (int i = 1; i < data.length; i++)
        {
            tmp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > tmp)
            {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }
    }

    void insertionSortDescend()
    {
        int tmp;
        for (int i = 1; i < data.length; i++)
        {
            tmp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] < tmp)
            {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }
    }
    int sequentialSearch(int search)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == search) return i;
        }
        return -1;
    }

    int[] getBiggestValue()
    {
        int[] pos = new int[2];
        int big = 0;
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] > big)
            {
                big = data[i];
                pos[0] = i;
                pos[1] = data[i];
            }
        }
        return pos;
    }
}
