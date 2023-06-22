package UE34;

public class Counter2 implements Runnable {
    static int counter;  //static = globalvariable

    private static Object printLock = new Object();

    @Override
    public void run() {
        synchronized (printLock) {
            while (counter < 20) {
                printLock.notify();
                counter++;
                System.out.println(Thread.currentThread().getName() +
                        " Counter: " + counter);
                try {
                    printLock.wait();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printLock.notify();
            }
        }

    }
}
