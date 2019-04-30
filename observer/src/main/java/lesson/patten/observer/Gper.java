package lesson.patten.observer;

import java.util.Observable;

/**
 * @author :lujia
 * @date :2019/4/30  10:55
 */
public class Gper extends Observable {


    private static Gper gper;

    private Gper(){

    }

    public static Gper getInstance(){
        if (null==gper){
            gper=new Gper();
        }
        return gper;
    }

    public  void publishQuestion(Question question){
        System.out.println(question.getName()+"提了一个问题---");
        setChanged();
        notifyObservers(question);
    }


}
