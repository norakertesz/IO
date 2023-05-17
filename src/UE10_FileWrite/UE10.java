package UE10_FileWrite;

import java.io.*;

public class UE10 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\test3.txt");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bR = new BufferedReader(isr);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        String text = bR.readLine();


        while (text != null) {

            if (text.toLowerCase().equals("stop")) {
                System.out.println("Du hast STOP geschrieben!");
                break;
            }
            pw.println(text);
            System.out.println(text);
            text = bR.readLine();
        }

        bR.close();
        pw.flush();
        pw.close();

    }


}

