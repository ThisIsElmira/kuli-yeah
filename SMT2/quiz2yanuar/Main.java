/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2yanuar;

public class Main {
    public static void main(String[] args){
        SingleLinkedList dll = new SingleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        //continue to call addLast, deleteLast,
        dll.addLast(69);
        dll.addLast(39);
        dll.addLast(70);
        dll.print();
        dll.deleteLast();
        dll.print();
        //merge, split,
        System.out.println("======= split (code B) ========");
        split(dll);
        merge(dll, dll);
    } 
    //2.A.
    public static void merge(SingleLinkedList l1,
            SingleLinkedList l2){
        //complete this method
    }
    //2.B. this will split sll to be 2 sll
    public static void split(SingleLinkedList l)
    {


        if (l.head == null) System.out.println("Linked list is still empty"); //used if the list is empty
        else {
            int size = l.size / 2; //used to make temporary size to split the size of the list
            int i = 0; //initialization of looping times
            Node tmp = l.head; //temporary data of head

            System.out.print("1st Part: ");
            while (i != size) //looping until the 1st half of the list
            {
                System.out.print(tmp.data + " "); //used to print first part
                tmp = tmp.n; //used to change the temporary data to the next part
                i++; //used to add the i
            }

            System.out.println();
            System.out.print("2nd Part: ");
            while (i != l.size) //looping until the 2nd half of the list
            {
                System.out.print(tmp.data + " "); //used to print second part
                tmp = tmp.n; //used to change the temporary data to the next part
                i++; //used to add the i
            }
        }
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //1-> 2,3,4,34
        //2-> 2,3,45,4
    }
}
