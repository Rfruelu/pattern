package lesson.patten.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author :lujia
 * @date :2019/4/30  10:56
 */
public class Teacher implements Observer {


    private  String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {

        Gper gper=(Gper) o;
        Question question=(Question) arg;
        System.out.println("=================");
        System.out.println(name+"您好，您收到一个问题");
        System.out.println("问题来自："+question.getName()+"--问题内容:"+question.getContent());

    }
}
