package composite.tree;

import lombok.Getter;

/**
 * @author wangyong
 * @Classname Component
 * @Description 容器
 * @Date 2021/8/9 11:42
 */
public abstract class Component {

    @Getter
    private String name;

    public Component(String name){
        this.name = name;
    }

    /**
     * 增加组件
     * @param c
     */
    public abstract void add(Component c);

    /**
     * 移除组件
     * @param c
     */
    public abstract void remove(Component c);

    /**
     * 深度
     * @param depth 深度
     */
    public abstract void display(int depth);
}
