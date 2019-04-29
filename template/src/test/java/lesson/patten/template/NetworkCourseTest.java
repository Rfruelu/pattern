package lesson.patten.template;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2019/4/29  13:56
 */
public class NetworkCourseTest {

    @Test
    public void test(){
        NetworkCourse javaNetWorkCourse=new JavaNetWorkCourse();
        javaNetWorkCourse.createCourse();

        NetworkCourse pythonNetworkCourse=new PythonNetworkCourse();
        pythonNetworkCourse.createCourse();


    }
}
