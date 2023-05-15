package UE5;

import java.io.File;

public class UE5 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\s53029\\Desktop\\Nora\\");

        myMethod(dir);


    }

    public static void myMethod(File f) {
        f = new File("C:\\Users\\s53029\\Desktop\\Nora\\test\\demo4\\demo5");

        // check if the directory can be created
        // using the abstract path name
        if (f.mkdirs()) {

            // display that the directory is created
            // as the function returned true
            System.out.println("Directory is created."+f.getAbsolutePath());
        } else {

            // display that the directory cannot be created
            // as the function returned false
            System.out.println("Directory cannot be created");
        }
    }

}
