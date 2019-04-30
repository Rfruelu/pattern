package lesson.patten.observer;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/30  11:33
 */
public class ObserverTest {
    @Test
    public void test(){
        Gper gper=Gper.getInstance();

        Teacher tom=new Teacher("tom");
        Teacher lujia=new Teacher("lujia");
        Question question=new Question();
        question.setName("小明");
        question.setContent("为何？");
        gper.addObserver(tom);
        gper.addObserver(lujia);
        gper.publishQuestion(question);

    }
}
