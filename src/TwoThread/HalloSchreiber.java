package TwoThread;

public class HalloSchreiber implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i = i + 1) {
                System.out.println(Thread.currentThread().getName()+" Hallooo!");
            }
        }
    }

