package lesson.patten.event;

import java.lang.reflect.InvocationTargetException;

/**
 * @author :lujia
 * @date :2019/4/30  13:41
 */
public class Mouse extends EventListener{


    public void click(){
        System.out.println("mouse click event");
        try {
            //触发事件钩子
            this.trigger(EventType.CLICK);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public void move(){
        System.out.println("mouse move event");
        try {
            //触发事件钩子
            this.trigger(EventType.MOVE);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
