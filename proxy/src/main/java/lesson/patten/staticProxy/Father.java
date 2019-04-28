package lesson.patten.staticProxy;

import lesson.patten.jdk.Person;

/**
 * 静态代理，实际就是组合
 * 缺陷;只能代理特定的对象
 * @author :lujia
 * @date :2019/4/28  15:24
 */
public class Father {

    private Person person;

    public Father(Son son){
        this.person=son;
    }

    public void find(){
        System.out.println("father find...start");
        person.find();
        System.out.println("father find...end");

    }
}
