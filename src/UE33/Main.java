package UE33;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter1);

        t1.start();
        t2.start();

    }
}
