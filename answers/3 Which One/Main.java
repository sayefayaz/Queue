import java.util.PriorityQueue;

public class Main {
    private PriorityQueue<Character> priorityQueue;
    public Main() {
        priorityQueue=new PriorityQueue<>((a,b)->b-a);
    }
    public void initializeQueue(String str)
    {
        for (char c :str.toCharArray())
        {
            priorityQueue.offer(c);
        }
    }
    public void enqueue(char item)
    {
        priorityQueue.offer(item);
    }

    public char dequeue()
    {
        return priorityQueue.poll();
    }

    public void print()
    {
        while (!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll()+",");
        }
        System.out.println();
    }
    public boolean isEmpty()
    {
        return priorityQueue.isEmpty();
    }

    public int size()
    {
        return priorityQueue.size();
    }


    public static void main(String[] args) {
        Main main=new Main();
        main.initializeQueue("ARYAN");
        main.print();
        main.enqueue('Y');
        System.out.println(main.dequeue());

    }
}
