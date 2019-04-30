package lesson.patten.event;

import lombok.Data;

import java.lang.reflect.Method;

/**
 * @author :lujia
 * @date :2019/4/30  11:38
 */
@Data
public class MouseEvent {

    /**
     * 事件源
     */
    private Object source;

    private Object target;

    protected Method callback;
    private String name;
    private long time;
}
