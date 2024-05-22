import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> queue;
    public MyQueue()
    {
        this.queue=new LinkedList<>();
    }
    public void enqueue(T item)
    {
        queue.addLast(item);
    }

    public T dequeue()
    {
        if (isEmpty()){
            throw new IllegalStateException("queue is empty");
        }
        return queue.removeFirst();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return  queue.size();
    }
}
