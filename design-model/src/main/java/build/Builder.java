package build;

/**
 * @author wangyong
 * @Classname Builder
 * @Description 抽象建造者
 * @Date 2021/8/4 9:49
 */
public abstract class Builder {

    /**
     * 构建部件A
     */
    public abstract void buildPartA();

    /**
     * 构建部件B
     */
    public abstract void buildPartB();

    /**
     * 获取产品
     * @return {@link Product}
     */
    public abstract Product getResult();
}
