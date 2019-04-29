package lesson.patten.template;

/**
 * @author :lujia
 * @date :2019/4/29  13:53
 */
public class JavaNetWorkCourse extends NetworkCourse {

    @Override
    protected boolean needHomeWork() {
        return true;
    }

    @Override
    protected void checkoutHomeWork() {
        System.out.println("检查java作业");
    }
}
