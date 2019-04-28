package lesson.patten.clone;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujia
 * @date :2019/4/28  14:15
 */
public class CloneTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        ShadowClone shadowClone =new ShadowClone();
        shadowClone.setName("lujia");
        shadowClone.setAge(20);
        List<String> alis=new ArrayList<>();
        alis.add("111");
        alis.add("110");
        alis.add("119");
        shadowClone.setAlis(alis);
        ShadowClone clone = (ShadowClone) shadowClone.clone();
        alis.remove("119");
        System.out.println(shadowClone);
        System.out.println(clone);

    }
}
