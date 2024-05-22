public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue=new MyQueue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println("dequeued : "+myQueue.dequeue());
        System.out.println("Empty ? "+myQueue.isEmpty());
        System.out.println("Elements : "+myQueue.size());
    }
}
