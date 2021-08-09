package composite.tree;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author wangyong
 * @Classname Composite
 * @Description 树枝
 * @Date 2021/8/9 11:50
 */
@Slf4j
public class Composite extends Component{

    /**
     * 子组件集合
     */
    private List<Component> components = Lists.newArrayList();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        components.remove(c);
    }

    @Override
    public void display(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + "[" + this.getName() + "]");
        components.forEach(component -> component.display(depth + 2));
    }

    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite x");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Composite com2 = new Composite("Composite XY");
        com2.add(new Leaf("Leaf XYA"));
        com2.add(new Leaf("Leaf XYB"));

        comp.add(com2);
        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
