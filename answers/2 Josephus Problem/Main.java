public class Main {
    public static int josephus(int n,int k)
    {
        if (n==1)
        {
            return 1;
        }else {
            return (josephus(n-1,k)+k-1)%n+1;
        }
    }

    public static void main(String[] args) {
        int n=7;
        int k=3;

        int lastRemaining=josephus(n,k);
        System.out.println("position of the last remaining person"+lastRemaining);
    }
}
