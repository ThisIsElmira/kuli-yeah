package Practice2;

public class Land
{
    public int length, width;

    public Land()
    {
    }

    public int landArea()
    {
        return length*width;
    }

    public int widestArea(Land[] landArray)
    {
        int widestArea = 0, land = 0;
        for (int i = 0; i < landArray.length; i++)
        {
            if (landArray[i].landArea() > widestArea)
            {
                widestArea = landArray[i].landArea();
                land = i + 1;
            }
        }
        return land;
    }
}
