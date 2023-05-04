package Prac;

public class Students
{
    int nim, age;
    String name;
    double gpa;

    Students(int ni, String nm, int age, double gpa)
    {
        nim = ni;
        name = nm;
        this.age = age;
        this.gpa = gpa;
    }

    void display()
    {
        System.out.println("NIM = " + nim);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("GPA = " + gpa);
    }
}
