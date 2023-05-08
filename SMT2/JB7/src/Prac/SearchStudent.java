package JB7.src.Prac;


public class SearchStudent
{
    Students[] listStd = new Students[5];
    int idx;

    void add(Students std)
    {
        if (idx < listStd.length)
        {
            listStd[idx] = std;
            idx++;
        }
        else
        {
            System.out.println("Data is already full");
        }
    }

    void display()
    {
        for (Students students : listStd)
        {
            students.display();
            System.out.println("-----------------------");
        }
    }

    int findSeqSearch(int search)
    {
        int position = -1;
        for (int i = 0; i < listStd.length; i++)
        {
            if (listStd[i].nim == search)
            {
                position = i;
                break;
            }
        }
        return position;
    }

    int findBinarySearch(int search, int left, int right)
    {
        int mid;
        if (right >= left)
        {
            mid = (left + right)/2;
            if (search == listStd[mid].nim)
            {
                return (mid);
            }
            else if (listStd[mid].nim > search)
            {
                return findBinarySearch(search, left, mid-1);
            }
            else
            {
                return findBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }

    void showPosition(int x, int pos)
    {
        if(pos != -1)
        {
            System.out.println("Data : " + x + " is found in index-" + pos);
        }
        else
        {
            System.out.println("Data : " + x + " isn't found");
        }
    }

    void showData(int x, int pos)
    {
        if (pos != -1)
        {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("GPA \t : " + listStd[pos].gpa);
        }
        else
        {
            System.out.println("Data " + x + " isn't found");
        }
    }

    void selectionSort()
    {
        for(int i = 0; i < listStd.length; i++)
        {
            int idxMin = i;
            for (int j = i + 1; j < listStd.length; j++) if (listStd[j].nim < listStd[idxMin].nim) idxMin = j;
            Students tmp = listStd[idxMin];
            listStd[idxMin] = listStd[i];
            listStd[i] = tmp;
        }
    }

    int binarySearch(int search, int left, int right)
    {
        int mid;
        if (right >= left)
        {
            mid = (left + right)/2;
            if (search == listStd[mid].nim) return mid;
            else if (listStd[mid].nim > search) return findBinarySearch(search, left, mid - 1);
            else return findBinarySearch(search, mid + 1, right);
        }
        return -1;
    }

    int findNameSequential(String search)
    {
        for (int i = 0; i< listStd.length; i++)
        {
            if (listStd[i].name.equalsIgnoreCase(search)) return i;
        }
        return -1;
    }

    void showNamePosition(String search, int pos)
    {
        if (pos != -1) System.out.println("Data: " + search + " is found in index-" + pos);
        else System.out.println("Data: " + search + " isn't found");
    }

    void showNameData(String search, int pos)
    {
        if (pos != -1)
        {
            System.out.println("NIM\t : " + listStd[pos].nim);
            System.out.println("Name\t :" + search);
            System.out.println("Age\t : " + listStd[pos].age);
            System.out.println("GPA\t : " + listStd[pos].gpa);
        }
        else System.out.println("Data: " + search + " isn't found");
    }
}
