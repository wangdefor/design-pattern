package composite.company;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangyong
 * @Classname ConcreteCompany
 * @Description 具体公司
 * @Date 2021/8/9 14:22
 */
public class ConcreteCompany extends Company{

    private List<Company> children = Lists.newArrayList();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder builder;
        builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("-");
        }
        System.out.println(builder.toString() + "[" + this.getName() + "]");
        children.forEach(child -> child.display(depth + 2));
    }

    @Override
    public void lineOfDuty() {
        children.forEach(Company::lineOfDuty);
    }

    public static void main(String[] args) {
        ConcreteCompany company = new ConcreteCompany("上海总公司");
        company.add(new FinanceDepartment("上海财务部"));
        company.add(new HRDepartment("上海HR部门"));
        //添加北京分公司
        ConcreteCompany jingCompany = new ConcreteCompany("北京分公司");
        company.add(jingCompany);
        //添加北京分部
        jingCompany.add(new FinanceDepartment("北京财务分部"));
        jingCompany.add(new HRDepartment("北京HR部门"));
        company.display(1);
        company.lineOfDuty();
    }
}
