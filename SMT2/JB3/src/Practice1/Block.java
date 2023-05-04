package Practice1;

public class Block
{
    public int width, length, height;

    public Block()
    {
    }

    public int countSurfaceArea()
    {
        return 2*((width*length) + (length*height) + (width*height));
    }

    public int countVolume()
    {
        return length*width*height;
    }
}
