package lesson.patten.clone;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujia
 * @date :2019/4/28  14:43
 */
public class DeepCloneTest {

    @Test
    public void test() throws CloneNotSupportedException {
        DeepClone deepClone=new DeepClone();

        deepClone.setName("lujia");
        deepClone.setAge(20);
        List<String> list=new ArrayList<>();
        list.add("112");
        list.add("113");
        deepClone.setAlis(list);
        DeepClone clone = deepClone.clone();
        list.add("114");

        System.out.println(deepClone);
        System.out.println(clone);
    }

}
