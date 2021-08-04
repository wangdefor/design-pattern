package build;

/**
 * @author wangyong
 * @Classname ConcreteBuildA
 * @Description 具体建造者角色A
 * @Date 2021/8/4 9:53
 */
public class ConcreteBuilderA extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
