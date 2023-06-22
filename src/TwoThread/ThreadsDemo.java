package TwoThread;

public class ThreadsDemo {
    public static void main(String[] args) {
        Thread eins = new Thread(new HalloSchreiber());
        eins.setName("Thread 1");
        Thread zwei = new Thread(new HalloSchreiber());
        zwei.setName("Thread 2");

        eins.start();
        zwei.start();

        System.out.println("Threads gestartet!");

        Person k = new Person("Ksenija");
        Person m = new Person("Myla");
        Thread t1 = new Thread(k);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
        System.out.println("main() ende");

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main(): Beide andere Threads sind fertig.");

    }
}
