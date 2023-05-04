package Asg;

import java.util.Scanner;
import java.util.Stack;

public class Asg1Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert Sentence: ");
        String sent = sc.nextLine();

        Asg1 stacks = new Asg1(sent.length());
        for (int i = 0; i < sent.length(); i++) stacks.push(sent.charAt(i));
        stacks.print();
    }
}
