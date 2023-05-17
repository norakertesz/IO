package UE15_BinaereOutputSave;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UE15 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test3.txt");
        FileOutputStream fos = new FileOutputStream(file);


        char c;
        while ((c = (char) System.in.read()) != 'x') {
            fos.write(c);
            System.out.println(c);
        }
        fos.flush();
        fos.close();
        System.out.println("Closed");
    }

    }


