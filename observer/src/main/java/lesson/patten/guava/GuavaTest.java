package lesson.patten.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author :lujia
 * @date :2019/4/30  15:24
 */
public class GuavaTest {
    public static void main(String[] args) {
        EventBus eventBus=new EventBus();
        GuavaEvent guavaEvent=new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("123");


    }
}
