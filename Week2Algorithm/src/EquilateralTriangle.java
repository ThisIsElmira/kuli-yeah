public class EquilateralTriangle
{
    static double calcCircumference(int side)
    {
        return 3*side;
    }

    static double calcArea(int side)
    {
        double height = (Math.sqrt(Math.pow(side, 2) - Math.pow(side/2, 2)));
        return ((side * height)/2);
    }

    public static void main(String[] args)
    {
        int sideTri = 3;
        System.out.println("Circumference = " + calcCircumference(sideTri));
        System.out.println("Area = " + calcArea(sideTri));
    }
}
