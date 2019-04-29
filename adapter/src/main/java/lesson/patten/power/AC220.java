package lesson.patten.power;

import lombok.Data;

/**
 * @author :lujia
 * @date :2019/4/29  15:08
 */
@Data
public class AC220 {

    private int v;

    public void input(int v){
        this.v=v;
        System.out.println("输入220V--AC");
    }
}
