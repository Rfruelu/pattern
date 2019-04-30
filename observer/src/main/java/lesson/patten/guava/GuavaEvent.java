package lesson.patten.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author :lujia
 * @date :2019/4/30  15:23
 */
public class GuavaEvent {

    @Subscribe
    public void say(String  name){
        System.out.println("Subscribe---"+name);
    }
}
