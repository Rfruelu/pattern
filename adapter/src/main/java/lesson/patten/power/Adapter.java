package lesson.patten.power;

/**
 * @author :lujia
 * @date :2019/4/29  15:11
 */
public class Adapter {

    public DC5 adapter(AC220 ac220){
        System.out.println("输入:"+ac220);
        System.out.println("转换");
        ac220.setV(220);
        int v = ac220.getV();
        int i = v / 44;

        return new DC5(i);
    }
}
