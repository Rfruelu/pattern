package lesson.patten.clone;

import lombok.Data;

import java.util.List;

/**
 * 浅克隆
 * @author :lujia
 * @date :2019/4/28  14:12
 */
@Data
public class ShadowClone implements Cloneable{


    private String name;

    private int age;

    private List<String> alis;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
