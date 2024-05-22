public class Main {
    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue=new CircularQueue<>(5);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);

        System.out.println("dequeued : "+circularQueue.dequeue());
        System.out.println("Empty ? "+circularQueue.isEmpty());
        System.out.println("Elements : "+circularQueue.size());
    }
}
