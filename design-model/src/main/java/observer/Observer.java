package observer;

/**
 * @author wangyong
 * @Classname Observer
 * @Description 抽象观察者
 * @Date 2021/8/4 10:12
 */
public interface Observer {

    /**
     * 发生改变的时候，进行更新
     */
    void update();
}
