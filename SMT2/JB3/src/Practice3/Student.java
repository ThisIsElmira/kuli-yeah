package Practice3;

public class Student
{
    public String name, gender;
    public double ipk, nim;

    public Student()
    {
    }

    public double averageIPK(Student[] studentArray)
    {
        double averageIPK = 0;
        for (int i = 0; i < studentArray.length; i++)
        {
            averageIPK += studentArray[i].ipk;
        }
        return averageIPK / studentArray.length;
    }
}
