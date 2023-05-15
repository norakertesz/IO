package UE1;

import java.io.File;
import java.io.IOException;

public class Uebung1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53029\\IdeaProjects\\Programmieren3\\src\\UE1\\myFile.txt");

//"myFile.txt" - relative
// "/a.txt" - absolute
        System.out.println("File created: " + file.getName());
        System.out.println("myFile is a file: " + file.isFile());
        System.out.println("myFile exists: " + file.exists());
        System.out.println("My path is: " + file.getParent());
        System.out.println("My path is: " + file.getAbsolutePath());
        System.out.println("Parent Directory of the File: " + file.getParentFile().getName());
        System.out.println("is a directory? :" + file.isDirectory());
        System.out.println("is a file?: " + file.isFile());
        System.out.println("can I read?: " + file.canRead());
        System.out.println("can I write?: " + file.canWrite());
        System.out.println("hidden?: " + file.isHidden());
        double fileSize = file.length() / 1024.0;
        System.out.println("Filesize: " + fileSize + " kB");
        File file2 = new File("k.txt");
        file2.createNewFile();
        System.out.println(file2.getName());

//        try {
//            file2.createNewFile();
//        } catch (Exception e) {
//            System.out.println("Fehler: "+e.getMessage());
//        }
    }


}
