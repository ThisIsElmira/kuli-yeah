public class RentalTransaction
{
    String memberID, memberName, gameName;
    int dailyPrice, dayRent;

    RentalTransaction(String mid, String mn, String gn, int dp, int dr)
    {
        memberID = mid;
        memberName = mn;
        gameName = gn;
        dailyPrice = dp;
        dayRent = dr;
    }

    int rentalPrice()
    {
        return dailyPrice*dayRent;
    }

    void printRental()
    {
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Game Price: " + dailyPrice);
        System.out.println("Rent Duration: " + dayRent);
        System.out.println("Total Price: " + rentalPrice());
    }
}