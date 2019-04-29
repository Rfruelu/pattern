package lesson.patten.delegate;

/**
 * 项目经理不会亲自去做工作，
 * 项目经理分解任务，排期，交给适合的人去完成
 * @author :lujia
 * @date :2019/4/28  17:32
 */

public class Leader {

    public void dispatcher(String command){

        if ("write".equals(command)){
            new Writer().doWrite();
        }else if("read".equals(command)){
            new Reader().doReader();
        }else {
            System.out.println("null");
        }


    }
}
