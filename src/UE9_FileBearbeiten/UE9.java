package UE9_FileBearbeiten;

import java.io.*;

public class UE9 {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test2.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("This is a printWriter");
        pw.println("123456");
        pw.flush();
        pw.close();
    }
}
