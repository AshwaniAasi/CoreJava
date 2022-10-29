package HackerRank.practices;

import java.io.*;

class Mauj implements Serializable
{
     int id;
    String name;

    transient String text;

    Mauj(int id, String name, String text)
    {
        this.id=id;
        this.name=name;
        this.text=text;
    }
}
class Streama {
    public static void main(String[] args) {
        Mauj m1= new Mauj(420,"gadha","Aaj meri kahani suru hui hai");
        try
        {
            FileOutputStream fos= new FileOutputStream("Mauj Ki Kahani.txt");
            ObjectOutputStream out=new ObjectOutputStream(fos);
            out.writeObject(m1);
            out.flush();
            out.close();
            System.out.println("Output done");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try
        {
            //creating stream  to read the object
            FileInputStream fis= new FileInputStream("Mauj ki kahani.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Mauj m2= (Mauj) ois.readObject();
            ois.close();
            System.out.println(m2.id +" : "+m2.name+" : "+" : "+m2.text);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}