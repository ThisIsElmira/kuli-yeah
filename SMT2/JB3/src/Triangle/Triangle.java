package Triangle;

public class Triangle
{
    public int a;
    public int t;

    public Triangle()
    {
        this.a = 0;
        this.t = 0;
    }

    public Triangle (int a, int t)
    {
        this.a = a;
        this.t = t;
    }

    public double countArea()
    {
        return this.a * this.t * 0.5;
    }

    public double countPerimeter()
    {
        double perimeter = Math.sqrt(this.a * this.a + this.t * this.t);
        return this.a + this.t + perimeter;
    }
}