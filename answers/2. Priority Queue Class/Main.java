public class Main {
    public static void main(String[] args) {
        MyInitialPriorityQueue <String> myInitialPriorityQueue=new MyInitialPriorityQueue<>();
        myInitialPriorityQueue.enqueueWithPriorirty("item 1 : ",2);
        myInitialPriorityQueue.enqueueWithPriorirty("item 2 : ",1);
        myInitialPriorityQueue.enqueueWithPriorirty("item 3 : ",3);

        System.out.println("Dequeued : "+myInitialPriorityQueue.dequeueHighestPriority());
        System.out.println("Empty ? "+myInitialPriorityQueue.isEmpty());
        System.out.println("Elements : "+myInitialPriorityQueue.size());
    }
}
