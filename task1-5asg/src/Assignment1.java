public class Assignment1
{
    static int cost = 4_500;
    static double discount = 0.05;
    static int[] customer = {4, 15, 6, 11};
    public static void main(String[] args)
    {
        int total = 0;
        for (int weight : customer)
        {
            total += weight > 10 ? (weight*cost)*discount : weight*cost;
        }
        System.out.println("Total income is " + total);
    }
}