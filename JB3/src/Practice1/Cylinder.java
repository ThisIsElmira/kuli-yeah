package Practice1;

public class Cylinder
{
    public int rad, height;

    public Cylinder()
    {
    }

    public double countSurfaceArea()
    {
        return 2*Math.PI*rad*rad+rad*height;
    }

    public double countVolume()
    {
        return Math.PI*rad*rad*height;
    }
}
