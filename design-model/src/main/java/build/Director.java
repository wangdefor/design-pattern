package build;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wangyong
 * @Classname Director
 * @Description TODO
 * @Date 2021/8/4 9:59
 */
@Slf4j
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilderA();
        Builder b2 = new ConcreteBuilderB();
        //开始指挥生产b1
        log.info("开始指挥生产 b1");
        director.construct(b1);
        Product p1 = b1.getResult();
        p1.show();
        log.info("开始指挥生产 b2");
        director.construct(b2);
        Product p2 = b2.getResult();
        p2.show();
    }
}
