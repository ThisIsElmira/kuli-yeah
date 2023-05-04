package Practice1;

public class Cube
{
    public int side;

    public Cube()
    {
    }

    public int countSurfaceArea()
    {
        return 6*side;
    }

    public int countVolume()
    {
        return side*side*side;
    }
}
