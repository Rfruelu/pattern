package lesson.patten.staticProxy;

import lesson.patten.jdk.Person;

/**
 * @author :lujia
 * @date :2019/4/28  15:23
 */
public class Son implements Person {

    @Override
    public void eat() {
        System.out.println("son eat");
    }

    @Override
    public void find(){
        System.out.println("son find");
    }
}
