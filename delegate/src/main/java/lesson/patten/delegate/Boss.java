package lesson.patten.delegate;

import lombok.Data;

/**
 * boss下发命令
 * @author :lujia
 * @date :2019/4/28  17:31
 */
@Data
public class Boss {


    private Leader leader;
    public void doWork(String command){
        //交给项目经理执行
        leader.dispatcher(command);
    }
}
