// todo: Implement Queue Data Structure using Stack Data Structure...

import java.util.Scanner;
import java.util.Stack;
public class Queues
{
    public void InsertQueue(Stack<Integer> sck, Stack<Integer> sck1, int data)
    {
        while(!sck.isEmpty())
        {
            int pop = sck.pop();
            sck1.push(pop);
        }
        sck.push(data);
        while(!sck1.isEmpty())
        {
            int pop = sck1.pop();
            sck.push(pop);
        }
        return;
    }
    public void PrintQueue(Stack<Integer> sck)
    {
        while(!sck.isEmpty())
        {
            System.out.print(sck.peek());
            sck.pop();
        }
        System.out.println();
        return;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        Queues queues = new Queues();
        int x, a;
        System.out.print("Enter the number of Nodes : ");
        x = sc.nextInt();
        for(int i = 1; i <= x; i++)
        {
            System.out.print("Enter Node data : ");
            a = sc.nextInt();
            queues.InsertQueue(stack, stack1, a);
        }
        queues.PrintQueue(stack);
        sc.close();
    }
}