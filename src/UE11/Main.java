package UE11;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("until starting up...");

        Product m = new Product("Milch", 0.95, "Milchprodukt");
        Product j = new Product("Joghurt", 0.55, "Milchprodukt");
        Product t = new Product("Schwarztee", 1.55, "Trockenware");
        ProdudtManager myList = new ProdudtManager();
        myList.add(m);
        myList.add(j);
        myList.add(t);
        myList.saveToFile("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test3.txt");
        myList.readFromFile("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test3.txt");

    }
}
