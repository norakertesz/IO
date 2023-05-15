package UE3;

import java.io.File;

public class UE3 {

    public static void main(String[] args) {

        String dir = "C:\\Users\\s53029\\Desktop\\Nora\\WebDev";
        File f = new File(dir);
        File[] fileList = f.listFiles();
        printMyDirectory(fileList);
    }

    public static void printMyDirectory(File[] myArray) {
        int i = 0;
        for (File file: myArray) {


            if (file.isDirectory()) {

                System.out.println("Eintrag " + i + ": " + "Dir:" + file.getAbsolutePath());
                System.out.println("");
                System.out.println("*****Weil es ein Ordner ist, hier der Inhalt: "+ file.getAbsoluteFile());
                System.out.println("**********************************************************");
                printMyDirectory(file.listFiles());
            } else {
                System.out.println("Eintrag " + i + ": " + "File:" + file.getAbsolutePath());

            }
            i++;
        }

    }

}
