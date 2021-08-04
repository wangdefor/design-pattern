package observer;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wangyong
 * @Classname ConcreteSubject
 * @Description 具体的主题或者通知者
 * @Date 2021/8/4 10:22
 */
public class ConcreteSubject extends Subject{

    /**
     * 具体的状态
     */
    @Getter
    @Setter
    private String subjectState;
}
