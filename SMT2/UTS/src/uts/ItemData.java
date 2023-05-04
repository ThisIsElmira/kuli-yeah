package uts;

public class ItemData
{
    int itemCode, stock;
    String name, category;
    ItemData(int itemCode, int stock, String name, String category)
    {
        this.itemCode = itemCode;
        this.stock = stock;
        this.name = name;
        this.category = category;
    }

    void print()
    {
        System.out.println(itemCode + "\t\t" + category + "\t\t" + name + "\t\t" + stock);
    }
}
