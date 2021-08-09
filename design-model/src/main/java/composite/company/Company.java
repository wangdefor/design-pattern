package composite.company;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author wangyong
 * @Classname Company
 * @Description 公司
 * @Date 2021/8/9 14:19
 */
@Slf4j
public abstract class Company {

    /**
     * 名称
     */
    @Getter
    private String name;

    public Company(String name){
        this.name = name;
    }

    /**
     * 增加
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 展示
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();
}
