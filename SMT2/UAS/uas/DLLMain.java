package UAS.uas;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Imam`
 */
public class DLLMain {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addLast(10);
        dll.addLast(100);
        dll.addLast(34);
        dll.addLast(20);
        dll.addLast(200);
        dll.addLast(75);
        dll.print();

        //cek fungsi toArray()
        System.out.println("Display of array with toArray() function");
        int[] arr = dll.toArray();
        for(int x : arr){
            System.out.print(x+", ");
        }
        System.out.println();
        
        //cek fungsi sublist()
        System.out.println("Display of array with sublist(1, 3) function");
        DLL subList = dll.sublist(1, 3);
        subList.print();
        
        //cek fungsi addAll()
        System.out.println("Display of array with addAll() function");
        DLL dll2 = new DLL();
        dll2.addLast(212);
        dll2.addLast(212);
        dll2.addLast(212);
        dll.addAll(dll2);
        dll.print();
        
        //cek fungsi containAll
        System.out.println("Display of array with containAll() function");
        DLL dll3 = new DLL();
        dll3.addLast(100);
        dll3.addLast(34);
        dll3.addLast(212);
        System.out.println(""+dll.containsAll(dll3));
        
        //cek fungsi removeAll()
        System.out.println("Display all data with removeALL() function");
        dll.removeAll(dll3);
        dll.print();
    }
}
