package UE11;

import java.io.*;
import java.util.ArrayList;

public class ProdudtManager {
    private ArrayList<Product> myList = new ArrayList<>();

    public void add(Product p) {
        myList.add(p);
    }

    public void saveToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        BufferedWriter buffer = new BufferedWriter(fw);
        for (Product p : myList) {
            buffer.write(p.toString());
            //buffer.write(" \n");
            buffer.newLine();

        }
        buffer.flush();
        buffer.close();
    }

    public void readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String zeile;
        while ((zeile = bufferedReader.readLine()) != null) {
            System.out.println(zeile);
        }
    }

    @Override
    public String toString() {
        return
                "myList=" + myList +
                        '}';
    }
}
