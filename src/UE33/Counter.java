package UE33;

public class Counter implements Runnable {
    private static Object myLock = new Object();
    private int counter = 1;

    @Override
    public void run() {
        for (; counter < 21; ) {

            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (myLock) {
                    if (counter > 20) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + " " + counter);
                    counter++;
                }

            }
        }
    }
}



