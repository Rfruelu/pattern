package lesson.patten.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :lujia
 * @date :2019/4/30  13:38
 */
public class EventListener {


    private Map<EventType,MouseEvent> events=new ConcurrentHashMap<>();

    public void addListener(EventType eventType,Object target){
        String name = eventType.name();
        name=name.toLowerCase();
        char[] chars = name.toCharArray();
        chars[0] -=32;
        name=String.valueOf(chars);
        try {
            Method method = target.getClass().getMethod("on" + name, MouseEvent.class);
            this.addListener(eventType,target,method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private void addListener(EventType eventType, Object target, Method method) {
        MouseEvent mouseEvent = new MouseEvent();
        mouseEvent.setCallback(method);
        mouseEvent.setTarget(target);
        events.put(eventType,mouseEvent);
    }

    protected void trigger(EventType eventType) throws InvocationTargetException, IllegalAccessException {
        if (eventType!=null){
            if (!events.containsKey(eventType)){
                return;
            }
            //从注册的事件列表中找到对应的监听者，执行回调
            MouseEvent mouseEvent = events.get(eventType);
            if (mouseEvent!=null){
                mouseEvent.setSource(this);
                mouseEvent.setTime(System.currentTimeMillis());
                //执行回调
                Method callback = mouseEvent.getCallback();
                if (callback==null){
                    return;
                }
                callback.invoke(mouseEvent.getTarget(),mouseEvent);
            }
        }

    }
}
