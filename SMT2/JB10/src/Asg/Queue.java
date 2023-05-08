package JB10.src.Asg;

public class Queue
{
    int max, size, front, rear;
    Student[] Q;

    Queue(int max)
    {
        this.max = max;
        create();
    }

    void create()
    {
        Q = new Student[max];
        size = 0;
        front = rear - 1;
    }

    boolean isFull()
    {
        return size == max;
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    void enqueue(Student data)
    {
        if(isFull()) System.out.println("Queue is already full");
        else
        {
            if (isEmpty()) front = rear = 0;
            else
            {
                if (rear == max -1) rear = 0;
                else rear++;
            }
            Q[rear] = data;
            size++;
        }
    }

    Student dequeue()
    {
        Student data = new Student("", "",  0, 0);
        if(isEmpty()) System.out.println("Queue is still empty");
        else
        {
            data = Q[front];
            size--;
            if(isEmpty()) front = rear = -1;
            else
            {
                if (front == max - 1) rear = 0;
                else front++;
            }
        }
        return data;
    }

    void print()
    {
        if (isEmpty()) System.out.println("Queue is still empty");
        else
        {
            int i = front;
            while(i != rear)
            {
                System.out.println(Q[i].name + " " + Q[i].nim + " " + Q[i].classNumber + " " + Q[i].gpa);
                i = (i + 1) % max;
            }
            System.out.println(Q[rear].name + " " + Q[rear].nim + " " + Q[rear].classNumber + " " + Q[rear].gpa);
//            System.out.println(Q[i] + " ");
            System.out.println("Element amount : " + size);
        }
    }

    void peekRear()
    {
        if (!isEmpty()) System.out.println(Q[rear].name + " " + Q[rear].nim + " " + Q[rear].classNumber + " " + Q[rear].gpa);
        else System.out.println("Queue is still empty");
    }

    void peek()
    {
        if (!isEmpty()) System.out.println("The first element : " + Q[front].name + " " + Q[front].nim + " " + Q[front].classNumber + " " + Q[front].gpa);
        else System.out.println("Queue is still empty");
    }

    void clear()
    {
        if (!isEmpty())
        {
            front = rear = -1;
            size = 0;
            System.out.println("Queue has been cleared successfully");
        }
        else System.out.println("Queue is still empty");
    }

    void peekPosition(String nim)
    {
        Student student = null;
        for (int i = 0; i < Q.length; i++)
        {
            if (Q[i] == null) continue;
            if (nim.equals(Q[i].nim))
            {
                student = Q[i];
                break;
            }
        }

        if (student != null)
        {
            System.out.println("Selected Student : " + student.name + " " + student.nim + " " + student.classNumber + " " + student.gpa);
            return;
        }

        System.out.println("The Inputted NIM isn't available");
    }

    void printStudents(int pos)
    {
        int index = (pos + front) % max;
        if (Q[index] == null) System.out.println("There is no Student at that queue");
        else System.out.println("Selected Student : " + Q[index].name + " " + Q[index].nim + " " + Q[index].classNumber + " " + Q[index].gpa);
    }
}
