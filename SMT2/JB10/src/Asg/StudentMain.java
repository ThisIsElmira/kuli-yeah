package JB10.src.Asg;

import java.util.Scanner;

public class StudentMain
{
    public static void menu()
    {
        System.out.println("Choose menu: ");
        System.out.println("1. Queue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("5. Clear queue");
        System.out.println("6. Check last queue");
        System.out.println("7. Search Student data by inputting NIM");
        System.out.println("8. Search Student data by inputting queue number");
        System.out.println("===========================");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert maximum queue : ");
        int max = sc.nextInt();
        Queue queue = new Queue(max);

        int choose;
        do
        {
            menu();
            choose = sc.nextInt();
            switch (choose)
            {
                case 1:
                    System.out.print("Name: ");
                    String nm = sc.next();
                    sc.nextLine();
                    System.out.print("Nim: ");
                    String nim = sc.next();
                    sc.nextLine();
                    System.out.print("Class Number: ");
                    int classNum = sc.nextInt();
                    System.out.print("GPA: ");
                    int gpa = sc.nextInt();
                    Student p = new Student(nm, nim, classNum, gpa);
                    sc.nextLine();
                    queue.enqueue(p);
                    break;
                case 2:
                    Student data = queue.dequeue();
                    if (!"".equals(data.name) && !"".equals(data.nim)) System.out.println("Data removed : " + data.name + " " + data.nim + " " + data.classNumber + " " + data.gpa);
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    queue.peekRear();
                    break;
                case 7:
                    System.out.print("NIM : ");
                    String pos = sc.next();
                    sc.nextLine();
                    queue.peekPosition(pos);
                    break;
                case 8:
                    System.out.print("Queue: ");
                    int select = sc.nextInt();
                    queue.printStudents(select);
                    break;
            }
        }
        while(choose <= 8 && choose >= 1);
    }
}
