package uts;

public class ItemProgram
{
    ItemData[] item = new ItemData[9];
    int index;

    void add(ItemData t)
    {
        if (index < item.length)
        {
            item[index] = t;
            index++;
        }
        else
        {
            System.out.println("The item list is full-filled");
        }
    }

    void displayAll()
    {
        System.out.println("itemCode\t\tname\t\tcategory\t\tinitial stock");
        for (ItemData t: item)
        {
            if(t != null)
            {
                t.print();
            }
        }
    }

    void bubbleSort()
    {
        for (int i = 0; i< item.length-1; i++)
        {
            for (int j = 1; j < item.length-i; j++)
            {
                if (item[j].stock < item[j-1].stock)
                {
                    ItemData temp = item[j];
                    item[j] = item[j-1];
                    item[j-1] = temp;
                }
            }
        }
    }

    void displayNoStock()
    {
        System.out.println("food that has 0 stock is/are");
        for(int i = 0; i < item.length; i++)
        {
            if (item[i].stock == 0)
            {

                System.out.println(item[i].name);
            }
            else
            {
                System.out.println("No Food has 0 Stock");
            }
        }
    }

    int findNameSequential(String search)
    {
        for (int i = 0; i< item.length; i++)
        {
            if (item[i].name.equalsIgnoreCase(search)) return i;
        }
        return -1;
    }

    void showData(int pos)
    {
        if (pos != -1)
        {
            System.out.println("Stock \t\t : " + item[pos].stock);
            System.out.println("Name \t\t : " + item[pos].name);
            System.out.println("Category \t : " + item[pos].category);
            System.out.println("itemCode \t : " + item[pos].itemCode);
        }
        else
        {
            System.out.println("Data " + pos + " isn't found");
        }
    }
}
