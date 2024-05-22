public class CircularQueue<T> {
    private  int maxSize;
    private T[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public CircularQueue(int maxSize)
    {
        this.maxSize=maxSize;
        this.queueArray=(T[])new Object[maxSize];
        this.front=0;
        this.rear=-1;
        this.currentSize=0;
    }

    public void enqueue(T item)
    {
        if (currentSize==maxSize)
        {
            throw new IllegalStateException("queue is full");
        }
        rear=(rear+1)%maxSize;
        queueArray[rear]=item;
        currentSize++;
    }

    public T dequeue()
    {
        if (isEmpty())
        {
            throw  new IllegalStateException("queue is empty");
        }
        T item=queueArray[front];
        front=(front+1)%maxSize;
        currentSize--;
        return item;

    }
    public boolean isEmpty()
    {
        return currentSize==0;
    }
    public int size()
    {
        return currentSize;
    }

}
