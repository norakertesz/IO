package UE4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UE4 {
    public static void main(String[] args) {

        String mydir = "C:\\Users\\s53029\\Desktop\\Nora\\WebDev";
        printMyDirectory(mydir);

    }

    public static void printMyDirectory(String dirpath) {
        Path mypath = Paths.get(dirpath);
        int i = 0;
        String dir = "C:\\Users\\s53029\\Desktop\\Nora\\WebDev";
        File f = new File(dir);
        File[] fileList = f.listFiles();
        double sum = 0;
        for (File dir2 : fileList) {
            if (dir2.isFile()) {
                System.out.println("Eintrag " + i + ": " + "File:" + dir2.getAbsolutePath() + " " + dir2.length()+ "bytes");

                double length= dir2.length()/1024.0;
                sum+=length;
            }

            i++;

        }
        System.out.println("the size is of all files together: "+sum+"kb");
    }

}


