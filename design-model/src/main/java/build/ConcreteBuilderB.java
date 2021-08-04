package build;

/**
 * @author wangyong
 * @Classname ConcreteBuilderB
 * @Description 具体建造者B
 * @Date 2021/8/4 9:55
 */
public class ConcreteBuilderB extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
