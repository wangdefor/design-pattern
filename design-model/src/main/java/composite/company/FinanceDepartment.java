package composite.company;

/**
 * @author wangyong
 * @Classname FinanceDepartment
 * @Description TODO
 * @Date 2021/8/9 14:29
 */
public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder builder;
        builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + "[" + this.getName() + "]");
    }

    @Override
    public void lineOfDuty() {
        System.out.println(getName() + ":负责财务支出");
    }
}
