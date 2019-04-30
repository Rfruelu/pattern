package lesson.patten.event;

/**
 * @author :lujia
 * @date :2019/4/30  13:41
 */
public class MouseEventTest {

    public static void main(String[] args) {


        CallBack callBack=new CallBack();

        Mouse mouse=new Mouse();
        mouse.addListener(EventType.MOVE,callBack);
        mouse.addListener(EventType.CLICK,callBack);
        mouse.move();

    }
}
