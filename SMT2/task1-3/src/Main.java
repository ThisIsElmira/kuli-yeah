public class Main {
    public static void main(String[] args)
    {
        int[] prices = {75_000, 50_000, 60_000};
        int[][] data =
                {
                        {10, 5, 15, 7},
                        {6, 11, 9, 12},
                        {2, 10, 10, 5},
                        {5, 7, 12, 9}
                };
        for (int i = 0; i < data.length; i++)
        {
            int stock = 0;
            for (int j = 0; j < data[0].length; j++)
            {
                stock = stock + data[i][j];
            }
            System.out.println("Stock of Branch " + (i+1) + ": " + stock);
        }

        System.out.println("New information, some stocks on RoyalGarden 1 are decreased");
        System.out.println("Therefore RoyalGarden 1 income are decreased from " + ((data[0][0]*prices[0])+(data[1][0]*prices[1])+(data[3][0]*prices[2])));
        data[0][0] = data[0][0] - 1;
        data[1][0] = data[1][0] - 2;
        data[3][0] = data[3][0] - 5;
        System.out.println("become " + ((data[0][0]*prices[0])+(data[1][0]*prices[1])+(data[3][0]*prices[2])));
    }
}