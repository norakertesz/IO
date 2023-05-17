package UE14_BinaereOutPut;

import java.io.*;

public class UE14 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test3.txt");
        FileOutputStream fos = new FileOutputStream(file);
        String outputText = "Hello File";

        for (char c : outputText.toCharArray()) {
            c = 10;
            System.out.println("Schreibe char: " + (int) c + "in die Datei..");
            fos.write(c);

        }
        fos.flush();
        fos.close();

    }

}
