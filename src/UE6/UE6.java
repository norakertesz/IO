package UE6;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class UE6 {
    public static void main(String[] args) throws IOException {
        File mydir = new File ("C:\\Users\\s53029\\Desktop\\Nora\\test\\demo4");
        createTenFiles(mydir);

    }
    public static void createTenFiles(File dir) throws IOException {

        for (int i = 0; i < 10; i++) {
            String fileName = ThreadLocalRandom.current().nextInt() + ".mp3";
            File fileToCreate = new File(dir.getAbsolutePath() + " " + fileName);
            fileToCreate.createNewFile();
            if (fileToCreate.createNewFile()) {
                System.out.println("File created: " + fileToCreate.getName());
            } else {
                System.out.println("File already exists.");
            }

        }
    }
}
