package JB11.AsgNo4and5;

public class Customer
{
    String name, address, customerAccountNumber;

    Customer (String name, String address, String customerAccountNumber)
    {
        this.name = name;
        this.address = address;
        this.customerAccountNumber = customerAccountNumber;
    }

    public void print(){
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Account Number : " + customerAccountNumber);
        System.out.println("=======================");
    }
}
