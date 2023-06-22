package UebungTime;

import java.util.Date;
import java.util.Scanner;

public class UebungTime {

    private static boolean isRunning = true;

    public static void main(String[] args) {
        Thread clockThread = new Thread(new ClockRunnable());
        Thread clockThread2 = new Thread(new ClockRunnable());


        clockThread.start();
        clockThread2.start();

        // Warten auf Tastendruck zum Beenden
        Scanner scanner = new Scanner(System.in);
        System.out.println("Drücken Sie Enter, um die Anwendung zu beenden.");
        scanner.nextLine();


        // Anwendung stoppen
        isRunning = false;
        try {
            clockThread.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        System.out.println("Enter gedrueckt - Die Anwendung wurde beendet.");

    }

    private static class ClockRunnable implements Runnable {
        //Sperrobjekt
        private static Object watchLock = new Object();

        @Override
        public void run() {
            synchronized (watchLock) {
                while (isRunning) {

                    Date d = new Date();
                    System.out.println(Thread.currentThread().getName());
                    System.out.print("[");
                    System.out.print(d.toString());
                    System.out.print(", CPUS: ");
                    System.out.print(Runtime.getRuntime().availableProcessors());
                    System.out.print(", FreeMem: ");
                    System.out.print(Runtime.getRuntime().freeMemory());
                    System.out.print("]");
                    System.out.println(" ");


                    try {
                        Thread.sleep(1000); // Warte 1 Sekunde
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}