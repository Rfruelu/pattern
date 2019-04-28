package lesson.patten.clone;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * 深克隆
 * @author :lujia
 * @date :2019/4/28  14:34
 */
@Data
public class DeepClone implements Cloneable {

    private String name;

    private int age;

    private List<String> alis;

    @Override
    public DeepClone clone() throws CloneNotSupportedException {
        String[] objects =this.alis.toArray(new String[]{});
        List<String> objects1 = Arrays.asList(objects);
        DeepClone deepClone=new DeepClone();
        deepClone.setName(this.name);
        deepClone.setAge(this.age);
        deepClone.setAlis(objects1);
        return deepClone;
    }
}
