package observer;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author wangyong
 * @Classname Subject
 * @Description 主题
 * @Date 2021/8/4 10:12
 */
@Slf4j
public abstract class Subject {

    /**
     * 观察这集合
     */
    private List<Observer> observers = Lists.newArrayList();

    /**
     * 增加观察者
     */
    public void attach(Observer observer){
        //开始增加观察者
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知观察者们
     */
    public void notifyObserver(){
        log.info("状态发生变更，开始通知观察者们");
        observers.forEach(observer -> observer.update());
    }
}
