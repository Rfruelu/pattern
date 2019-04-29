package lesson.patten.delegate;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/28  17:39
 */
public class DelegateTest {


    @Test
    public void test(){
        Boss boss=new Boss();
        boss.setLeader(new Leader());
        boss.doWork("read");
        boss.doWork("write");
    }
}
