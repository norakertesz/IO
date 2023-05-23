package UE16_ObjektSchreiben;

import java.io.*;

public class UE16 {
    public static class MyClass implements Serializable {
        int a = 5;
        String b = "Hey";
        byte[] c = {'e', 'x'};
        double d = 1.2;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Start...");
        String text = "Hallo Welt!";
        String text2 = "Hallö Nora mit Ö!";
        MyClass meinObjekt = new MyClass();
        File file = new File("C:\\Users\\s53029\\Desktop\\Nora\\P3\\object.dat");

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        System.out.println("-------String Objekt als File speichern-------");
        //oos.writeObject(meinObjekt);
        oos.writeObject(text);
        oos.writeObject(text2);

        System.out.println("Mein objekt ist hier: " + file.getAbsolutePath());
        oos.close();
        fileOutputStream.close();

        System.out.println("-------Objekt einlesen-------");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\s53029\\Desktop\\Nora\\P3\\object.dat"));
        String abc = (String) ois.readObject();
        String bcd = (String) ois.readObject();
        System.out.println(abc + " " + bcd);
//        try {
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\s53029\\Desktop\\Nora\\P3\\object.dat"));
//            System.out.println(ois.readObject());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


    }
}
