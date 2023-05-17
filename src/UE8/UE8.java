package UE8;

import java.io.*;

public class UE8 {
    public static void main(String[] args) throws IOException {



        //File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader myFile = new BufferedReader(inputStreamReader);//mein text in der Zwischenpeicher gespeichert

        String text = myFile.readLine();
        String stop="STOP";

        while (text!=null){

            if(text.toLowerCase().equals("stop")){
                System.out.println("Du hast STOP geschrieben!");
                break;
            }
            System.out.println(text);
            text= myFile.readLine();
        }
        myFile.close();//alles muss immer zu machen
    }
}
