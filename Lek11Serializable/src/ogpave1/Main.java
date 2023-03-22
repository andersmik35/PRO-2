package ogpave1;

import com.sun.source.tree.TryTree;
import eksempelpersist.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MyTime mytime = null;

       try (FileInputStream f_in = new FileInputStream("mytime.ser")) {
            try (ObjectInputStream obj_in = new ObjectInputStream(f_in)) {
                Object obj = obj_in.readObject();

                if (obj instanceof MyTime) {
                    mytime = (MyTime) obj;
                    System.out.println(mytime);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        mytime.reset();
       mytime.increse();
       mytime.increse();
       //mytime.saveTime();
       mytime.getTimes();


        try (FileOutputStream f_out = new FileOutputStream("mytime.ser")) {
            try (ObjectOutputStream obj_out = new ObjectOutputStream(f_out)) {
                obj_out.writeObject(mytime);
                System.out.println("Person er gemt: " + mytime);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


      /* try (FileOutputStream f_out = new FileOutputStream("mytime.ser")) {
            try (ObjectOutputStream obj_out = new ObjectOutputStream(f_out)) {
                obj_out.writeObject(mytime);
                System.out.println("mytime er gemt: " + mytime);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/


    }
}


