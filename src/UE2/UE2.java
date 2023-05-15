package UE2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UE2 {

    public static void main(String[] args) {

        String dir = "C:\\";
        File f = new File(dir);
        System.out.println(f.isDirectory());
        File[] fileList = f.listFiles();

        System.out.println("0.: "+fileList[0].toString());
        System.out.println("1.: "+fileList[1].toString());
//        int i=0;
//        for (File dir2 : fileList) {
//            if (dir2.isDirectory()) {
//                System.out.println("Eintrag " + i + ": " + "Dir:" + dir2.getAbsolutePath());
//            } else {
//                System.out.println("Eintrag " + i + ": " + "File:" + dir2.getAbsolutePath());
//
//            }  i++;
//        }
        printMyDirectory(fileList);
    }

    public static void printMyDirectory(File[] myArray){
        int i=0;
        for (File dir2 : myArray) {
            if (dir2.isDirectory()) {
                System.out.println("Eintrag " + i + ": " + "Dir:" + dir2.getAbsolutePath());
            } else {
                System.out.println("Eintrag " + i + ": " + "File:" + dir2.getAbsolutePath());

            }
            i++;
        }

    }


}
