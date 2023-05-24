package UE8_FileRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UE8mitException {
    public static void main(String[] args) {


//File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader myFile = new BufferedReader(inputStreamReader);//mein text in der Zwischenpeicher gespeichert
        try {
            String text = myFile.readLine();
            String stop = "STOP";

            while (text != null) {

                if (text.toLowerCase().equals("stop")) {
                    System.out.println("Du hast STOP geschrieben!");
                    break;
                }
                System.out.println(text);
                text = myFile.readLine();
            }
            myFile.close();//alles muss immer zu machen
            throw new IOException("TEST");
        } catch (IOException e) {
            System.out.println("Fehler:IOException, etwas ist schief gelaufen.");
        }


    }
}
