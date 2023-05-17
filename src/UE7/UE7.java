package UE7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UE7 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader myFile = new BufferedReader(fileReader);//mein text in der Zwischenpeicher gespeichert
        String text = myFile.readLine();
        while (text!=null){
        System.out.println(text);
        text= myFile.readLine();
    }
        myFile.close();//alles muss immer zu machen
        fileReader.close(); //das muessen wir nicht schlossen
}}
