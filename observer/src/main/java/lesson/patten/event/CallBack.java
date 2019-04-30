package lesson.patten.event;

/**
 * @author :lujia
 * @date :2019/4/30  14:51
 */
public class CallBack {

    public void onClick(MouseEvent event){
        System.out.println("onClick callback");
        System.out.println(event);
    }
    public void onMove(MouseEvent event){
        System.out.println("onMove callback");
        System.out.println(event);
    }

}
