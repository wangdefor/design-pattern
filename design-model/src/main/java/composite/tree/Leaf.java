package composite.tree;

import cn.hutool.core.text.StrBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wangyong
 * @Classname Leaf
 * @Description 叶子节点
 * @Date 2021/8/9 11:45
 */
@Slf4j
public class Leaf extends Component{


    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        log.info("叶子节点不具备添加功能");
    }

    @Override
    public void remove(Component c) {
        log.info("叶子节点不具备删除功能");
    }

    @Override
    public void display(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + "[" + this.getName() + "]");
    }
}
