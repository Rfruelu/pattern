package lesson.patten.hungry;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author :lujia
 * @date :2019/4/23  23:39
 */
public class HungrySingletonTest {

    @Test
    public void test(){
        HungrySingleton hungrySingleton=HungrySingleton.getInstance();
        System.out.println(hungrySingleton);

        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println(instance);
        boolean b = hungrySingleton == instance;
        System.out.println("==:"+b);
    }

    @Test
    public void testSerializable() throws IOException {

        HungrySingleton hungrySingleton=HungrySingleton.getInstance();


        ObjectOutputStream objectOutputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            objectOutputStream=new ObjectOutputStream(new FileOutputStream("hungrySingleton"));
            objectOutputStream.writeObject(hungrySingleton);

            System.out.println(hungrySingleton);
            objectInputStream=new ObjectInputStream(new FileInputStream(new File("hungrySingleton")));
            HungrySingleton o = (HungrySingleton)objectInputStream.readObject();
            System.out.println(o);

            System.out.println(hungrySingleton==o);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            objectOutputStream.close();
            objectInputStream.close();
        }
    }
}
