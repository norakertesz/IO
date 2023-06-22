package UE11_ListInFileSpeichern;

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

    public void readFromFile(String path) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String zeile;
        while (true) {
            try {
                if (!((zeile = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
