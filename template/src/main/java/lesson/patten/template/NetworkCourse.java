package lesson.patten.template;

/**
 * 模板模式，模板
 * @author :lujia
 * @date :2019/4/29  13:47
 */
public abstract class NetworkCourse {

    protected final void createCourse(){

        postPreResource();

        liveVideo();

        if(needHomeWork()){
            checkoutHomeWork();
        }
    }

    protected abstract void checkoutHomeWork();

    /**
     * 是否需要不知作业，钩子方法默认不需要
     * 子类可以自定义重写
     * @return
     */
    protected  boolean needHomeWork(){
        return false;
    }

    private final void liveVideo(){
        System.out.println("视频直播上课");
    }

    private final void postPreResource(){
        System.out.println("发布预习资料");
    }

}
