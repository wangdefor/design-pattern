package observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangyong
 * @Classname ConcreteObserver
 * @Description ConcreteObserver
 * @Date 2021/8/4 10:24
 */
@Slf4j
public class ConcreteObserver implements Observer{

    /**
     * 观察者名称
     */
    private String name;

    /**
     * 观察者状态
     */
    private String observerState;

    /**
     * 订阅的主题
     */
    private ConcreteSubject subject;

    /**
     * 构造函数
     *
     * @param subject 訂閲的主题
     * @param name 名称
     */
    public ConcreteObserver(ConcreteSubject subject,String name){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        log.info("观察者[{}]的新状态是[{}]",name,observerState);
    }

    public static void main(String[] args) {
        //创建一个主题
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //定义三个需要订阅这些主题的观察者
        Observer observerWang = new ConcreteObserver(concreteSubject,"老王");
        Observer observerZhang = new ConcreteObserver(concreteSubject,"老张");
        Observer observerLi = new ConcreteObserver(concreteSubject,"老李");
        //添加观察者
        concreteSubject.attach(observerLi);
        concreteSubject.attach(observerWang);
        concreteSubject.attach(observerZhang);
        //设置状态
        concreteSubject.setSubjectState("ABC");
        //开始通知
        concreteSubject.notifyObserver();
        //移除观察者
        concreteSubject.detach(observerWang);
        //设置状态，并通知
        concreteSubject.setSubjectState("BCD");
        concreteSubject.notifyObserver();
    }
}
