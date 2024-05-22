import java.util.PriorityQueue;

public class MyInitialPriorityQueue<T> {
    private PriorityQueue<T> porityQueue;
    public MyInitialPriorityQueue()
    {
        this.porityQueue=new PriorityQueue<>();
    }
    public void initializePriorityQueue()
    {
        porityQueue.clear();
    }

    public void enqueueWithPriorirty(T item,int priority)
    {
        porityQueue.offer(item);
    }

    public T dequeueHighestPriority()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Poriority queue is Empty");
        }
        return porityQueue.poll();
    }

    public boolean isEmpty()
    {
        return porityQueue.isEmpty();
    }

    public int size()
    {
        return porityQueue.size();
    }
}
