package URLUE1;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) {


        try {

            System.out.println("Main starting up...");
            System.out.println("Bitte die gewünschte URL eingeben:");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String user_url = input.readLine();
            System.out.println("Habe folgende URL bekommen: " + "'" + user_url + "'");
//URL auslesen
            URL myUrl = new URL(user_url);
            InputStreamReader isr = new InputStreamReader(myUrl.openStream());
            BufferedReader br = new BufferedReader(isr);
            String one_line;
            File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\urltest.html");
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            BufferedInputStream bis = new BufferedInputStream(myUrl.openStream());
            FileOutputStream fis = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int count=0;
            while((count = bis.read(buffer,0,1024)) != -1)
            {
                fis.write(buffer, 0, count);
            }
            fis.close();
            bis.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

