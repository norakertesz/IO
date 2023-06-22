package UE34;

import UE33.Counter;

public class Main {
    public static void main(String[] args) {
        Counter2 counter1 = new Counter2();

        Thread t1 = new Thread(counter1);
        Thread t2 = new Thread(counter1);

        t1.start();
        t2.start();

    }
}
