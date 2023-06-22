package TwoThread;

public class Person implements Runnable{
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Konstruktor von Klasse Person: "+name+" "+"eingelegt");
    }


    @Override
    public void run() {
        System.out.println("Konstruktor von Klasse Person "+name+" run() aufgerugen");
        for (int i = 0; i <=10; i++) {
            System.out.println(name+" "+Thread.currentThread().getName()+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


}
